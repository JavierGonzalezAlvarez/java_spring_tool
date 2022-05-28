package com.jga.web.app.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class ParamsController {

	
	@GetMapping("/")
	public String index() {
		return "params/index";
	}
		
	@GetMapping("/string")
	public String param(@RequestParam (name="textoenviado", defaultValue="hola") String textoenviado, Model model) {
		model.addAttribute("salida", "Text sent is:" + textoenviado);
		return "params/params";
	}
	
	@GetMapping("/integer")
	public String param(@RequestParam String name, @RequestParam Integer number, Model model) {
		model.addAttribute("salida", "Text and integer sent, string is:" + name + " number is " + number);
		return "params/number";
	}
	
	@GetMapping("/integer1")
	public String param(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		Integer number = null;
		try {
			number = Integer.parseInt(request.getParameter("number"));
		} catch (NumberFormatException e) {
			number = 34;
		}
		model.addAttribute("salida", "Text and integer sent, string is:" + name + " number is " + number);
		return "params/number";
	}
	
}
