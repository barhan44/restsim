package com.github.barhan44.restsim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
@EnableTransactionManagement
public class RestsimApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestsimApplication.class, args);
	}

}
