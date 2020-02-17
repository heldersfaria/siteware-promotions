package br.com.siteware.promotions.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ObjectMapperConfig {

    @Bean
    ModelMapper modelMapper() {
        return new ModelMapper();
    }
}