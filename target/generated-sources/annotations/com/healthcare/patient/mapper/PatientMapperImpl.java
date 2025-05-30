package com.healthcare.patient.mapper;

import com.healthcare.patient.dto.AddressDTO;
import com.healthcare.patient.dto.DiagnosisDTO;
import com.healthcare.patient.dto.InsuranceDetailsDTO;
import com.healthcare.patient.dto.PatientDTO;
import com.healthcare.patient.dto.PrimaryPhysicianDTO;
import com.healthcare.patient.dto.ReferralInfoDTO;
import com.healthcare.patient.entity.Address;
import com.healthcare.patient.entity.Diagnosis;
import com.healthcare.patient.entity.InsuranceDetails;
import com.healthcare.patient.entity.Patient;
import com.healthcare.patient.entity.PrimaryPhysician;
import com.healthcare.patient.entity.ReferralInfo;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-30T14:55:42+0530",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.42.0.v20250514-1000, environment: Java 21.0.7 (Eclipse Adoptium)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public PatientDTO toDTO(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDTO patientDTO = new PatientDTO();

        patientDTO.setAddress( toDTO( patient.getAddress() ) );
        patientDTO.setBirthDate( patient.getBirthDate() );
        patientDTO.setDiagnoses( diagnosisListToDiagnosisDTOList( patient.getDiagnoses() ) );
        patientDTO.setEmail( patient.getEmail() );
        patientDTO.setFirstName( patient.getFirstName() );
        patientDTO.setId( patient.getId() );
        patientDTO.setInsuranceDetails( toDTO( patient.getInsuranceDetails() ) );
        patientDTO.setLastName( patient.getLastName() );
        patientDTO.setMaritalStatus( patient.getMaritalStatus() );
        patientDTO.setMedicalRecordNumber( patient.getMedicalRecordNumber() );
        patientDTO.setMobile( patient.getMobile() );
        patientDTO.setPrimaryPhysician( toDTO( patient.getPrimaryPhysician() ) );
        patientDTO.setReferralInfo( toDTO( patient.getReferralInfo() ) );
        patientDTO.setSex( patient.getSex() );
        patientDTO.setStartOfCareDate( patient.getStartOfCareDate() );
        patientDTO.setStatus( patient.getStatus() );

        return patientDTO;
    }

    @Override
    public Patient toEntity(PatientDTO patientDTO) {
        if ( patientDTO == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setAddress( toEntity( patientDTO.getAddress() ) );
        patient.setBirthDate( patientDTO.getBirthDate() );
        patient.setDiagnoses( diagnosisDTOListToDiagnosisList( patientDTO.getDiagnoses() ) );
        patient.setEmail( patientDTO.getEmail() );
        patient.setFirstName( patientDTO.getFirstName() );
        patient.setId( patientDTO.getId() );
        patient.setInsuranceDetails( toEntity( patientDTO.getInsuranceDetails() ) );
        patient.setLastName( patientDTO.getLastName() );
        patient.setMaritalStatus( patientDTO.getMaritalStatus() );
        patient.setMedicalRecordNumber( patientDTO.getMedicalRecordNumber() );
        patient.setMobile( patientDTO.getMobile() );
        patient.setPrimaryPhysician( toEntity( patientDTO.getPrimaryPhysician() ) );
        patient.setReferralInfo( toEntity( patientDTO.getReferralInfo() ) );
        patient.setSex( patientDTO.getSex() );
        patient.setStartOfCareDate( patientDTO.getStartOfCareDate() );
        patient.setStatus( patientDTO.getStatus() );

        return patient;
    }

    @Override
    public AddressDTO toDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setAddressLine( address.getAddressLine() );
        addressDTO.setCity( address.getCity() );
        addressDTO.setCounty( address.getCounty() );
        addressDTO.setState( address.getState() );
        addressDTO.setZipCode( address.getZipCode() );

        return addressDTO;
    }

    @Override
    public Address toEntity(AddressDTO addressDTO) {
        if ( addressDTO == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddressLine( addressDTO.getAddressLine() );
        address.setCity( addressDTO.getCity() );
        address.setCounty( addressDTO.getCounty() );
        address.setState( addressDTO.getState() );
        address.setZipCode( addressDTO.getZipCode() );

        return address;
    }

    @Override
    public ReferralInfoDTO toDTO(ReferralInfo referralInfo) {
        if ( referralInfo == null ) {
            return null;
        }

        ReferralInfoDTO referralInfoDTO = new ReferralInfoDTO();

        referralInfoDTO.setEmail( referralInfo.getEmail() );
        referralInfoDTO.setId( referralInfo.getId() );
        referralInfoDTO.setMobile( referralInfo.getMobile() );
        referralInfoDTO.setReferrerName( referralInfo.getReferrerName() );

        return referralInfoDTO;
    }

    @Override
    public ReferralInfo toEntity(ReferralInfoDTO referralInfoDTO) {
        if ( referralInfoDTO == null ) {
            return null;
        }

        ReferralInfo referralInfo = new ReferralInfo();

        referralInfo.setEmail( referralInfoDTO.getEmail() );
        referralInfo.setId( referralInfoDTO.getId() );
        referralInfo.setMobile( referralInfoDTO.getMobile() );
        referralInfo.setReferrerName( referralInfoDTO.getReferrerName() );

        return referralInfo;
    }

    @Override
    public DiagnosisDTO toDTO(Diagnosis diagnosis) {
        if ( diagnosis == null ) {
            return null;
        }

        DiagnosisDTO diagnosisDTO = new DiagnosisDTO();

        diagnosisDTO.setDescription( diagnosis.getDescription() );
        diagnosisDTO.setDiagnosisCode( diagnosis.getDiagnosisCode() );
        diagnosisDTO.setId( diagnosis.getId() );
        diagnosisDTO.setType( diagnosis.getType() );

        return diagnosisDTO;
    }

    @Override
    public Diagnosis toEntity(DiagnosisDTO diagnosisDTO) {
        if ( diagnosisDTO == null ) {
            return null;
        }

        Diagnosis diagnosis = new Diagnosis();

        diagnosis.setDescription( diagnosisDTO.getDescription() );
        diagnosis.setDiagnosisCode( diagnosisDTO.getDiagnosisCode() );
        diagnosis.setId( diagnosisDTO.getId() );
        diagnosis.setType( diagnosisDTO.getType() );

        return diagnosis;
    }

    @Override
    public InsuranceDetailsDTO toDTO(InsuranceDetails insuranceDetails) {
        if ( insuranceDetails == null ) {
            return null;
        }

        InsuranceDetailsDTO insuranceDetailsDTO = new InsuranceDetailsDTO();

        insuranceDetailsDTO.setGroupNumber( insuranceDetails.getGroupNumber() );
        insuranceDetailsDTO.setId( insuranceDetails.getId() );
        insuranceDetailsDTO.setInsuranceProvider( insuranceDetails.getInsuranceProvider() );
        insuranceDetailsDTO.setPolicyHolderName( insuranceDetails.getPolicyHolderName() );
        insuranceDetailsDTO.setPolicyNumber( insuranceDetails.getPolicyNumber() );
        insuranceDetailsDTO.setRelationshipToPatient( insuranceDetails.getRelationshipToPatient() );

        return insuranceDetailsDTO;
    }

    @Override
    public InsuranceDetails toEntity(InsuranceDetailsDTO insuranceDetailsDTO) {
        if ( insuranceDetailsDTO == null ) {
            return null;
        }

        InsuranceDetails insuranceDetails = new InsuranceDetails();

        insuranceDetails.setGroupNumber( insuranceDetailsDTO.getGroupNumber() );
        insuranceDetails.setId( insuranceDetailsDTO.getId() );
        insuranceDetails.setInsuranceProvider( insuranceDetailsDTO.getInsuranceProvider() );
        insuranceDetails.setPolicyHolderName( insuranceDetailsDTO.getPolicyHolderName() );
        insuranceDetails.setPolicyNumber( insuranceDetailsDTO.getPolicyNumber() );
        insuranceDetails.setRelationshipToPatient( insuranceDetailsDTO.getRelationshipToPatient() );

        return insuranceDetails;
    }

    @Override
    public PrimaryPhysicianDTO toDTO(PrimaryPhysician primaryPhysician) {
        if ( primaryPhysician == null ) {
            return null;
        }

        PrimaryPhysicianDTO primaryPhysicianDTO = new PrimaryPhysicianDTO();

        primaryPhysicianDTO.setAddress( toDTO( primaryPhysician.getAddress() ) );
        primaryPhysicianDTO.setEmail( primaryPhysician.getEmail() );
        primaryPhysicianDTO.setId( primaryPhysician.getId() );
        primaryPhysicianDTO.setLicenseNumber( primaryPhysician.getLicenseNumber() );
        primaryPhysicianDTO.setName( primaryPhysician.getName() );
        primaryPhysicianDTO.setPhone( primaryPhysician.getPhone() );
        primaryPhysicianDTO.setSpecialty( primaryPhysician.getSpecialty() );

        return primaryPhysicianDTO;
    }

    @Override
    public PrimaryPhysician toEntity(PrimaryPhysicianDTO primaryPhysicianDTO) {
        if ( primaryPhysicianDTO == null ) {
            return null;
        }

        PrimaryPhysician primaryPhysician = new PrimaryPhysician();

        primaryPhysician.setAddress( toEntity( primaryPhysicianDTO.getAddress() ) );
        primaryPhysician.setEmail( primaryPhysicianDTO.getEmail() );
        primaryPhysician.setId( primaryPhysicianDTO.getId() );
        primaryPhysician.setLicenseNumber( primaryPhysicianDTO.getLicenseNumber() );
        primaryPhysician.setName( primaryPhysicianDTO.getName() );
        primaryPhysician.setPhone( primaryPhysicianDTO.getPhone() );
        primaryPhysician.setSpecialty( primaryPhysicianDTO.getSpecialty() );

        return primaryPhysician;
    }

    protected List<DiagnosisDTO> diagnosisListToDiagnosisDTOList(List<Diagnosis> list) {
        if ( list == null ) {
            return null;
        }

        List<DiagnosisDTO> list1 = new ArrayList<DiagnosisDTO>( list.size() );
        for ( Diagnosis diagnosis : list ) {
            list1.add( toDTO( diagnosis ) );
        }

        return list1;
    }

    protected List<Diagnosis> diagnosisDTOListToDiagnosisList(List<DiagnosisDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<Diagnosis> list1 = new ArrayList<Diagnosis>( list.size() );
        for ( DiagnosisDTO diagnosisDTO : list ) {
            list1.add( toEntity( diagnosisDTO ) );
        }

        return list1;
    }
}
