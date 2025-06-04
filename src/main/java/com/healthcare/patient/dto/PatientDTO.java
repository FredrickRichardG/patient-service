package com.healthcare.patient.dto;

import com.healthcare.patient.entity.MaritalStatus;
import com.healthcare.patient.entity.PatientStatus;
import com.healthcare.patient.entity.Sex;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
public class PatientDTO {
    private Long id;
    private String medicalRecordNumber;
    private LocalDate startOfCareDate;
    private PatientStatus status;
    private String firstName;
    private String lastName;
    private Sex sex;
    private LocalDate birthDate;
    private MaritalStatus maritalStatus;
    private String email;
    private String mobile;
    private AddressDTO address;
    private ReferralInfoDTO referralInfo;
    private List<DiagnosisDTO> diagnoses = new ArrayList<>();
    private InsuranceDetailsDTO insuranceDetails;
    private PrimaryPhysicianDTO primaryPhysician;
    private UserDto userDto;
} 