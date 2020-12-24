package com.health.Ehealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages="com.health.Ehealth.Repositories")
@SpringBootApplication
public class EhealthApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhealthApplication.class, args);
	}

}
