package com.healthcare.patient.dto;

import com.healthcare.patient.entity.DiagnosisType;
import lombok.Data;

@Data
public class DiagnosisDTO {
    private Long id;
    private String diagnosisCode;
    private String description;
    private DiagnosisType type;
} 