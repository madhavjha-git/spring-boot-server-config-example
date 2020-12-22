package com.centralconfig.centralConfigExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CentralConfigExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralConfigExampleApplication.class, args);
	}

}
