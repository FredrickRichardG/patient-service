package com.healthcare.patient.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "insurance_details")
@Getter
@Setter
public class InsuranceDetails extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "insurance_provider")
    private String insuranceProvider;

    @Column(name = "policy_number")
    private String policyNumber;

    @Column(name = "group_number")
    private String groupNumber;

    @Column(name = "policy_holder_name")
    private String policyHolderName;

    @Column(name = "relationship_to_patient")
    private String relationshipToPatient;
} 