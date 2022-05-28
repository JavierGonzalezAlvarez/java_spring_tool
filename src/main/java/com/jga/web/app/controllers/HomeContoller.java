package com.jga.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeContoller {
	
	//redirect
	@GetMapping("/")
	public String home() {
		return "redirect:/app/index";
	}
	
	@GetMapping("/google")
	public String home1() {
		return "redirect:https://www.google.com";
	}
	
	//forward
	@GetMapping("/forward")
	public String home2() {
		return "forward:/app/index";
	}

}
