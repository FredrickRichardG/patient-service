package com.healthcare.patient.service;

import com.healthcare.patient.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name="user-service")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    UserDto findById(@RequestParam Integer id);
}

