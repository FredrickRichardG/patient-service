package com.healthcare.patient.service.impl;

import com.healthcare.patient.annotation.ExecutionTime;
import com.healthcare.patient.config.KafkaAuditPublisher;
import com.healthcare.patient.dto.VitalSignsDTO;
import com.healthcare.patient.service.UserClient;
import com.healthcare.patient.dto.PatientDTO;
import com.healthcare.patient.dto.UserDto;
import com.healthcare.patient.entity.Patient;
import com.healthcare.patient.mapper.PatientMapper;
import com.healthcare.patient.repository.PatientRepository;
import com.healthcare.patient.service.PatientService;
import com.healthcare.patient.service.VitalClient;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final UserClient userClient;
    private final VitalClient vitalClient;
    private final PatientMapper patientMapper;
    private final KafkaAuditPublisher kafkaAuditPublisher;



    @CachePut(value="PATIENT_CACHE",key = "#result.id")
    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = patientMapper.toEntity(patientDTO);
        patient = patientRepository.save(patient);
        return patientMapper.toDTO(patient);
    }

    @CachePut(value="PATIENT_CACHE",key = "#id")
    @Override
    public PatientDTO updatePatient(Long id, PatientDTO patientDTO) {
        Patient existPatient = patientRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: " + id));

        PatientDTO patient = patientMapper.toDTO(existPatient);

        patientMapper.updateEntityFromDTO(patientDTO, existPatient);
        kafkaAuditPublisher.publish("Patient",id.toString(),"UPDATE",patient,existPatient,"system-user");

        Patient updatedPatient = patientRepository.save(existPatient);
        return patientMapper.toDTO(updatedPatient);
    }

    @ExecutionTime
    @Cacheable(value="PATIENT_CACHE",key = "#id")
    @Override
    @Transactional(readOnly = true)
    public PatientDTO getPatient(Long id) {
        UserDto user = userClient.findById(id.intValue());

        PatientDTO patientDTO = patientRepository.findById(id)
                .map(patientMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: " + id));
        patientDTO.setUserDto(user);
        List<VitalSignsDTO> vitalSign = vitalClient.findByPatientId(patientDTO.getMedicalRecordNumber());
        patientDTO.setVitalSignsDTO(vitalSign);
        return patientDTO;
    }

    @Override
    @Transactional(readOnly = true)
    public Page<PatientDTO> getAllPatients(Pageable pageable) {
        return patientRepository.findAll(pageable)
                .map(patientMapper::toDTO);
    }


    @CacheEvict(value="PATIENT_CACHE",key = "#id")
    @Override
    public void deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new EntityNotFoundException("Patient not found with id: " + id);
        }
        patientRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsByMedicalRecordNumber(String medicalRecordNumber) {
        return patientRepository.existsByMedicalRecordNumber(medicalRecordNumber);
    }

} 