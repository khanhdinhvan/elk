package com.example.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ELKApplicationService2 {

	private static final Logger logger = LoggerFactory.getLogger(ELKApplicationService2.class);

	public static void main(String[] args) {
		SpringApplication.run(ELKApplicationService2.class, args);
	}

	@GetMapping("/service2")
	public String hello() {

		logger.info("Hello World Service 2");

		try {
			int a = 1 / 0;
		} catch (Exception e) {
			logger.error("Error : " + e);
		}

		return "Hello World Service 2";
	}
}
