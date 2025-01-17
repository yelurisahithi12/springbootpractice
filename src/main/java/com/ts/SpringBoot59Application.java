package com.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.dao")
@EntityScan(basePackages="com.modal")
@SpringBootApplication(scanBasePackages="com")
public class SpringBoot59Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot59Application.class, args);
	}

}
