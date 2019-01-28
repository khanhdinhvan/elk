package com.example.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ELKApplicationService1 {

	private static final Logger logger = LoggerFactory.getLogger(ELKApplicationService1.class);

	public static void main(String[] args) {
		SpringApplication.run(ELKApplicationService1.class, args);
	}

	@GetMapping("/service1")
	public String hello() {

		logger.info("Hello World Service 1");
		String a = null;
		try {
			if (a.equals("a")) {
				System.out.println("OK");
			}
		} catch (Exception e) {
			logger.error("Error : " + e);
		}

		return "Hello World Service 1";
	}
}
