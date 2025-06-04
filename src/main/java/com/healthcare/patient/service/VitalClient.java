package com.healthcare.patient.service;

import com.healthcare.patient.dto.UserDto;
import com.healthcare.patient.dto.VitalSignsDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name="sign-service",url = "http://localhost:8091/")
public interface VitalClient {

    @GetMapping("/api/v1/vital-signs/patient/{patientId}")
    List<VitalSignsDTO> findByPatientId(@RequestParam String patientId);

}
