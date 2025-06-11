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
    date = "2025-06-11T17:33:58+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
@Component
public class PatientMapperImpl implements PatientMapper {

    @Override
    public PatientDTO toDTO(Patient patient) {
        if ( patient == null ) {
            return null;
        }

        PatientDTO patientDTO = new PatientDTO();

        patientDTO.setId( patient.getId() );
        patientDTO.setMedicalRecordNumber( patient.getMedicalRecordNumber() );
        patientDTO.setStartOfCareDate( patient.getStartOfCareDate() );
        patientDTO.setStatus( patient.getStatus() );
        patientDTO.setFirstName( patient.getFirstName() );
        patientDTO.setLastName( patient.getLastName() );
        patientDTO.setSex( patient.getSex() );
        patientDTO.setBirthDate( patient.getBirthDate() );
        patientDTO.setMaritalStatus( patient.getMaritalStatus() );
        patientDTO.setEmail( patient.getEmail() );
        patientDTO.setMobile( patient.getMobile() );
        patientDTO.setAddress( toDTO( patient.getAddress() ) );
        patientDTO.setReferralInfo( toDTO( patient.getReferralInfo() ) );
        patientDTO.setDiagnoses( diagnosisListToDiagnosisDTOList( patient.getDiagnoses() ) );
        patientDTO.setInsuranceDetails( toDTO( patient.getInsuranceDetails() ) );
        patientDTO.setPrimaryPhysician( toDTO( patient.getPrimaryPhysician() ) );

        return patientDTO;
    }

    @Override
    public Patient toEntity(PatientDTO patientDTO) {
        if ( patientDTO == null ) {
            return null;
        }

        Patient patient = new Patient();

        patient.setId( patientDTO.getId() );
        patient.setMedicalRecordNumber( patientDTO.getMedicalRecordNumber() );
        patient.setStartOfCareDate( patientDTO.getStartOfCareDate() );
        patient.setStatus( patientDTO.getStatus() );
        patient.setFirstName( patientDTO.getFirstName() );
        patient.setLastName( patientDTO.getLastName() );
        patient.setSex( patientDTO.getSex() );
        patient.setBirthDate( patientDTO.getBirthDate() );
        patient.setMaritalStatus( patientDTO.getMaritalStatus() );
        patient.setEmail( patientDTO.getEmail() );
        patient.setMobile( patientDTO.getMobile() );
        patient.setAddress( toEntity( patientDTO.getAddress() ) );
        patient.setReferralInfo( toEntity( patientDTO.getReferralInfo() ) );
        patient.setDiagnoses( diagnosisDTOListToDiagnosisList( patientDTO.getDiagnoses() ) );
        patient.setInsuranceDetails( toEntity( patientDTO.getInsuranceDetails() ) );
        patient.setPrimaryPhysician( toEntity( patientDTO.getPrimaryPhysician() ) );

        return patient;
    }

    @Override
    public void updateEntityFromDTO(PatientDTO dto, Patient entity) {
        if ( dto == null ) {
            return;
        }

        entity.setMedicalRecordNumber( dto.getMedicalRecordNumber() );
        entity.setStartOfCareDate( dto.getStartOfCareDate() );
        entity.setStatus( dto.getStatus() );
        entity.setFirstName( dto.getFirstName() );
        entity.setLastName( dto.getLastName() );
        entity.setSex( dto.getSex() );
        entity.setBirthDate( dto.getBirthDate() );
        entity.setMaritalStatus( dto.getMaritalStatus() );
        entity.setEmail( dto.getEmail() );
        entity.setMobile( dto.getMobile() );
        entity.setAddress( toEntity( dto.getAddress() ) );
        entity.setReferralInfo( toEntity( dto.getReferralInfo() ) );
        if ( entity.getDiagnoses() != null ) {
            List<Diagnosis> list = diagnosisDTOListToDiagnosisList( dto.getDiagnoses() );
            if ( list != null ) {
                entity.getDiagnoses().clear();
                entity.getDiagnoses().addAll( list );
            }
            else {
                entity.setDiagnoses( null );
            }
        }
        else {
            List<Diagnosis> list = diagnosisDTOListToDiagnosisList( dto.getDiagnoses() );
            if ( list != null ) {
                entity.setDiagnoses( list );
            }
        }
        entity.setInsuranceDetails( toEntity( dto.getInsuranceDetails() ) );
        entity.setPrimaryPhysician( toEntity( dto.getPrimaryPhysician() ) );
    }

    @Override
    public AddressDTO toDTO(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setAddressLine( address.getAddressLine() );
        addressDTO.setCity( address.getCity() );
        addressDTO.setState( address.getState() );
        addressDTO.setCounty( address.getCounty() );
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
        address.setState( addressDTO.getState() );
        address.setCounty( addressDTO.getCounty() );
        address.setZipCode( addressDTO.getZipCode() );

        return address;
    }

    @Override
    public ReferralInfoDTO toDTO(ReferralInfo referralInfo) {
        if ( referralInfo == null ) {
            return null;
        }

        ReferralInfoDTO referralInfoDTO = new ReferralInfoDTO();

        referralInfoDTO.setId( referralInfo.getId() );
        referralInfoDTO.setReferrerName( referralInfo.getReferrerName() );
        referralInfoDTO.setEmail( referralInfo.getEmail() );
        referralInfoDTO.setMobile( referralInfo.getMobile() );

        return referralInfoDTO;
    }

    @Override
    public ReferralInfo toEntity(ReferralInfoDTO referralInfoDTO) {
        if ( referralInfoDTO == null ) {
            return null;
        }

        ReferralInfo referralInfo = new ReferralInfo();

        referralInfo.setId( referralInfoDTO.getId() );
        referralInfo.setReferrerName( referralInfoDTO.getReferrerName() );
        referralInfo.setEmail( referralInfoDTO.getEmail() );
        referralInfo.setMobile( referralInfoDTO.getMobile() );

        return referralInfo;
    }

    @Override
    public DiagnosisDTO toDTO(Diagnosis diagnosis) {
        if ( diagnosis == null ) {
            return null;
        }

        DiagnosisDTO diagnosisDTO = new DiagnosisDTO();

        diagnosisDTO.setId( diagnosis.getId() );
        diagnosisDTO.setDiagnosisCode( diagnosis.getDiagnosisCode() );
        diagnosisDTO.setDescription( diagnosis.getDescription() );
        diagnosisDTO.setType( diagnosis.getType() );

        return diagnosisDTO;
    }

    @Override
    public Diagnosis toEntity(DiagnosisDTO diagnosisDTO) {
        if ( diagnosisDTO == null ) {
            return null;
        }

        Diagnosis diagnosis = new Diagnosis();

        diagnosis.setId( diagnosisDTO.getId() );
        diagnosis.setDiagnosisCode( diagnosisDTO.getDiagnosisCode() );
        diagnosis.setDescription( diagnosisDTO.getDescription() );
        diagnosis.setType( diagnosisDTO.getType() );

        return diagnosis;
    }

    @Override
    public InsuranceDetailsDTO toDTO(InsuranceDetails insuranceDetails) {
        if ( insuranceDetails == null ) {
            return null;
        }

        InsuranceDetailsDTO insuranceDetailsDTO = new InsuranceDetailsDTO();

        insuranceDetailsDTO.setId( insuranceDetails.getId() );
        insuranceDetailsDTO.setInsuranceProvider( insuranceDetails.getInsuranceProvider() );
        insuranceDetailsDTO.setPolicyNumber( insuranceDetails.getPolicyNumber() );
        insuranceDetailsDTO.setGroupNumber( insuranceDetails.getGroupNumber() );
        insuranceDetailsDTO.setPolicyHolderName( insuranceDetails.getPolicyHolderName() );
        insuranceDetailsDTO.setRelationshipToPatient( insuranceDetails.getRelationshipToPatient() );

        return insuranceDetailsDTO;
    }

    @Override
    public InsuranceDetails toEntity(InsuranceDetailsDTO insuranceDetailsDTO) {
        if ( insuranceDetailsDTO == null ) {
            return null;
        }

        InsuranceDetails insuranceDetails = new InsuranceDetails();

        insuranceDetails.setId( insuranceDetailsDTO.getId() );
        insuranceDetails.setInsuranceProvider( insuranceDetailsDTO.getInsuranceProvider() );
        insuranceDetails.setPolicyNumber( insuranceDetailsDTO.getPolicyNumber() );
        insuranceDetails.setGroupNumber( insuranceDetailsDTO.getGroupNumber() );
        insuranceDetails.setPolicyHolderName( insuranceDetailsDTO.getPolicyHolderName() );
        insuranceDetails.setRelationshipToPatient( insuranceDetailsDTO.getRelationshipToPatient() );

        return insuranceDetails;
    }

    @Override
    public PrimaryPhysicianDTO toDTO(PrimaryPhysician primaryPhysician) {
        if ( primaryPhysician == null ) {
            return null;
        }

        PrimaryPhysicianDTO primaryPhysicianDTO = new PrimaryPhysicianDTO();

        primaryPhysicianDTO.setId( primaryPhysician.getId() );
        primaryPhysicianDTO.setName( primaryPhysician.getName() );
        primaryPhysicianDTO.setLicenseNumber( primaryPhysician.getLicenseNumber() );
        primaryPhysicianDTO.setSpecialty( primaryPhysician.getSpecialty() );
        primaryPhysicianDTO.setEmail( primaryPhysician.getEmail() );
        primaryPhysicianDTO.setPhone( primaryPhysician.getPhone() );
        primaryPhysicianDTO.setAddress( toDTO( primaryPhysician.getAddress() ) );

        return primaryPhysicianDTO;
    }

    @Override
    public PrimaryPhysician toEntity(PrimaryPhysicianDTO primaryPhysicianDTO) {
        if ( primaryPhysicianDTO == null ) {
            return null;
        }

        PrimaryPhysician primaryPhysician = new PrimaryPhysician();

        primaryPhysician.setId( primaryPhysicianDTO.getId() );
        primaryPhysician.setName( primaryPhysicianDTO.getName() );
        primaryPhysician.setLicenseNumber( primaryPhysicianDTO.getLicenseNumber() );
        primaryPhysician.setSpecialty( primaryPhysicianDTO.getSpecialty() );
        primaryPhysician.setEmail( primaryPhysicianDTO.getEmail() );
        primaryPhysician.setPhone( primaryPhysicianDTO.getPhone() );
        primaryPhysician.setAddress( toEntity( primaryPhysicianDTO.getAddress() ) );

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
