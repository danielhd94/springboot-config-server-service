package com.spring.boot.app.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringbootConfigServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootConfigServerServiceApplication.class, args);
	}

}
