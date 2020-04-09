package com.mav.business.uam;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UamApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(UamApplication.class);
		app.setLogStartupInfo(false);
		app.run(args);
	}

}
