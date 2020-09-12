package com.rjil.redis.monitoring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = {"http://127.0.01:8081"})
public class RedisController {

	@RequestMapping(value = "/home")
	public String home() {
		System.out.println("home()");
		return "index" ;
		
	}
	
}
