package com.healthcare.patient.dto;

import lombok.Data;

@Data
public class InsuranceDetailsDTO {
    private Long id;
    private String insuranceProvider;
    private String policyNumber;
    private String groupNumber;
    private String policyHolderName;
    private String relationshipToPatient;
} 