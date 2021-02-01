package com.figpop.bestpractices.propertiesfile.config;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;

import lombok.Data;

@Configuration
@PropertySource("classpath:database.properties")
@ConfigurationProperties(prefix = "database")
@Validated
@Data
public class DatabaseConfig {
	
	@NotBlank
	private String url;
	
	@NotBlank
    private String username;
	
	@Length(max = 4, min = 1)
    private String password;
	
	@Min(1000)
    @Max(10000)
	private int port;
}
