package com.jga.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}

	@GetMapping(value="/view")
	public String indexWeb(Model model) {
		model.addAttribute("name", "Javier");
		return "view";
	}
	
	
	
}
