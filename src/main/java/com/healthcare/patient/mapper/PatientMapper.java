package com.healthcare.patient.mapper;

import com.healthcare.patient.dto.*;
import com.healthcare.patient.entity.*;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toDTO(Patient patient);
    Patient toEntity(PatientDTO patientDTO);

    AddressDTO toDTO(Address address);
    Address toEntity(AddressDTO addressDTO);

    ReferralInfoDTO toDTO(ReferralInfo referralInfo);
    ReferralInfo toEntity(ReferralInfoDTO referralInfoDTO);

    DiagnosisDTO toDTO(Diagnosis diagnosis);
    Diagnosis toEntity(DiagnosisDTO diagnosisDTO);

    InsuranceDetailsDTO toDTO(InsuranceDetails insuranceDetails);
    InsuranceDetails toEntity(InsuranceDetailsDTO insuranceDetailsDTO);

    PrimaryPhysicianDTO toDTO(PrimaryPhysician primaryPhysician);
    PrimaryPhysician toEntity(PrimaryPhysicianDTO primaryPhysicianDTO);
} 