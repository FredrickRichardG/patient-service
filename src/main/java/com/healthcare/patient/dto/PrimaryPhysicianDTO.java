package com.healthcare.patient.dto;

import lombok.Data;

@Data
public class PrimaryPhysicianDTO {
    private Long id;
    private String name;
    private String licenseNumber;
    private String specialty;
    private String email;
    private String phone;
    private AddressDTO address;
} 