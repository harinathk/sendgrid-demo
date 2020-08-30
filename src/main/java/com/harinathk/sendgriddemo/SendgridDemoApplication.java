package com.harinathk.sendgriddemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SendgridDemoApplication implements CommandLineRunner {

	@Autowired
	SendGridMailer sendGridMailer;

	public static void main(String[] args) {
		SpringApplication.run(SendgridDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sendGridMailer.sendMail();
	}
}
