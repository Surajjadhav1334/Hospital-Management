package com.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalRestApiApplication.class, args);
		System.err.println("app start");
	}

}
