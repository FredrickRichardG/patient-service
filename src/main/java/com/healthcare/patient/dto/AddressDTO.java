package com.healthcare.patient.dto;

import lombok.Data;

@Data
public class AddressDTO {
    private String addressLine;
    private String city;
    private String state;
    private String county;
    private String zipCode;
} 