package com.g77tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.g77tech.service.MsgService;

@RestController
public class MsgRestController {

	@Autowired
	private MsgService service;
	
	@GetMapping("/welcome")
	public String getMsg() {
		
		System.out.println(service.getClass().getName());
		
		String welcomeMsg = service.getWelcomeMsg();
		
		welcomeMsg = welcomeMsg.toUpperCase();  // NullPointerException
		System.out.println(welcomeMsg);
		
		return welcomeMsg;
	}

	@GetMapping("/greet")
   	public String getGreetMsg() {
		String greetMsg = service.greetMsg();
		System.out.println(greetMsg);
		greetMsg = greetMsg.toUpperCase();
		System.out.println(greetMsg);
		return greetMsg;
    }
}
