package com.example.elk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@SpringBootApplication
@RestController
public class ELKApplicationService1 {

	private static final Logger logger = LoggerFactory.getLogger(ELKApplicationService1.class);

	static Date date = Calendar.getInstance().getTime();
	static DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

	public static void main(String[] args) {
		SpringApplication.run(ELKApplicationService1.class, args);
	}

	@GetMapping("/service1")
	public String hello() {
		logger.info("Hello World Service 1 ---> " + dateFormat.format(date));

		try {
			int a = 1 / 0;
		} catch (Exception e) {
			logger.error("Error : " + e.getMessage());
		}

		return "Hello World Service 1 ---> " + dateFormat.format(date);
	}
}
