package com.mealkit.bff.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // All endpoints in the application
                        .allowedOrigins("http://localhost:3000")  // Or other origins
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")  // Or other HTTP methods
                        .allowCredentials(true);
            }
        }; }}
