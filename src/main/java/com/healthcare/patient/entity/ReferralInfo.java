package com.healthcare.patient.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "referral_info")
@Getter
@Setter
public class ReferralInfo extends BaseAuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "referrer_name")
    private String referrerName;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile")
    private String mobile;
} 