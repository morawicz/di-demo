package cm.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

import cm.springframework.didemo.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String hello() {
		return greetingService.sayGreeting();
	}
 }
