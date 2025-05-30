package com.healthcare.patient.dto;

import lombok.Data;

@Data
public class ReferralInfoDTO {
    private Long id;
    private String referrerName;
    private String email;
    private String mobile;
} 