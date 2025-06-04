package com.healthcare.patient.service.impl;

import com.healthcare.patient.config.UserClient;
import com.healthcare.patient.dto.PatientDTO;
import com.healthcare.patient.dto.UserDto;
import com.healthcare.patient.entity.Patient;
import com.healthcare.patient.mapper.PatientMapper;
import com.healthcare.patient.repository.PatientRepository;
import com.healthcare.patient.service.PatientService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final UserClient userClient;
    private final PatientMapper patientMapper;


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
        if (!patientRepository.existsById(id)) {
            throw new EntityNotFoundException("Patient not found with id: " + id);
        }
        Patient patient = patientMapper.toEntity(patientDTO);
        patient.setId(id);
        patient = patientRepository.save(patient);
        return patientMapper.toDTO(patient);
    }

    @Cacheable(value="PATIENT_CACHE",key = "#id")
    @Override
    @Transactional(readOnly = true)
    public PatientDTO getPatient(Long id) {
        UserDto user = getUser(id.intValue());
        PatientDTO patientDTO = patientRepository.findById(id)
                .map(patientMapper::toDTO)
                .orElseThrow(() -> new EntityNotFoundException("Patient not found with id: " + id));
        patientDTO.setUserDto(user);
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

    public UserDto getUser(Integer id){
        return userClient.findById(id);

    }
} 