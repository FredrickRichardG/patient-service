package com.healthcare.patient.mapper;

import com.healthcare.patient.dto.*;
import com.healthcare.patient.entity.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    PatientDTO toDTO(Patient patient);
    Patient toEntity(PatientDTO patientDTO);
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "rowVersion", ignore = true)
    void updateEntityFromDTO(PatientDTO dto, @MappingTarget Patient entity);


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