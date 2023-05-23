package com.example.springbootauthorization.config;

import com.example.springbootauthorization.repository.UserRepository;
import com.example.springbootauthorization.service.AuthorizationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public AuthorizationService authorizationService(UserRepository repository) {
        return new AuthorizationService(repository);
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }
}