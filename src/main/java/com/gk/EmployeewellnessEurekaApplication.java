package com.gk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeewellnessEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeewellnessEurekaApplication.class, args);
	}

}
