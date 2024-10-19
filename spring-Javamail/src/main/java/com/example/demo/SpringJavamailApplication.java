package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.mailService.javaMailerService;

@SpringBootApplication
public class SpringJavamailApplication {

	@Autowired
	private javaMailerService jm;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJavamailApplication.class, args);
		
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void send() {
		
		jm.sendMail("kirubakaran9009@gmail.com","Test mail", "Testing the contendent for mail-Java mailer project");
	}

}
