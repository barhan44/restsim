package com.github.barhan44.restsim;

import org.springframework.boot.SpringApplication;

public class TestRestsimApplication {

	public static void main(String[] args) {
		SpringApplication.from(RestsimApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
