package com.ravi.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication(scanBasePackages={"com.ravi.service","com.ravi.controller"})
@EnableCassandraRepositories("com.ravi.service")
public class AirlinesApp {
	public static void main(String[] args) {
		SpringApplication.run(AirlinesApp.class, args);
	}
}
