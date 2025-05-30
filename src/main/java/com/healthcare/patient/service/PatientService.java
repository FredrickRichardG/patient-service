package com.healthcare.patient.service;

import com.healthcare.patient.dto.PatientDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatientService {
    PatientDTO createPatient(PatientDTO patientDTO);
    PatientDTO updatePatient(Long id, PatientDTO patientDTO);
    PatientDTO getPatient(Long id);
    Page<PatientDTO> getAllPatients(Pageable pageable);
    void deletePatient(Long id);
    boolean existsByMedicalRecordNumber(String medicalRecordNumber);
} 