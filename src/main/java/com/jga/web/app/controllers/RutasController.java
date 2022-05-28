package com.jga.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class RutasController {
	

	@GetMapping("/string/{name}")
	public String variable(@PathVariable String name) {		
		return "params/variable";
	}
	
	@GetMapping("/string1/{name}")
	public String variable(@PathVariable String name, Model model) {
		model.addAttribute("salida", "Text sent, string is:" + name );	
		return "params/variable";
	}
	
	@GetMapping("/string1/{name}/{number}")
	public String variable(
			@PathVariable String name, 
			@PathVariable Integer number,
			Model model) {
		model.addAttribute("salida1", "Text sent and number:" + name + "-" + number);	
		return "params/variable";
	}
	
	
	
}
