package com.healthcare.patient.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "primary_physicians")
@Getter
@Setter
public class PrimaryPhysician extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "license_number")
    private String licenseNumber;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Embedded
    private Address address;
} 