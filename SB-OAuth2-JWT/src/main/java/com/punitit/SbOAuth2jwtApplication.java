package com.punitit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.punitit.config.AppProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class SbOAuth2jwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbOAuth2jwtApplication.class, args);
	}
}
