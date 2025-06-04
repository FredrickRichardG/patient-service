package com.healthcare.patient.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class VitalSignsDTO {
    private Long id;

    private String patientId;

    private Integer pulse;

    private Integer systolicBP;

    private Integer diastolicBP;

    private Double temperature;

    private Integer respirations;

    private Double bloodSugar;

    private Double weight;

    private Double height;

    private Integer spo2Saturation;

    private Double ptInr;

    private String notes;
} 