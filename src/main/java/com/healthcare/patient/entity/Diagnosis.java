package com.healthcare.patient.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "diagnoses")
@Getter
@Setter
public class Diagnosis extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "diagnosis_code")
    private String diagnosisCode;

    @Column(name = "description")
    private String description;

    @Column(name = "diagnosis_type")
    @Enumerated(EnumType.STRING)
    private DiagnosisType type;
}
