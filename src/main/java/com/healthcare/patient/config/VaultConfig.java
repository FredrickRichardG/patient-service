package com.healthcare.patient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class VaultConfig {
    @Value("${db.username}")
    public String username;
    @Value("${db.password}")
    public String password;
}
