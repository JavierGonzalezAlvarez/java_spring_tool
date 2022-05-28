package com.jga.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jga.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

	
	@GetMapping(value="/index")
	public String index() {
		return "index";
	}

	@GetMapping(value="/view")
	public String indexWeb(Model model) {
		model.addAttribute("name", "Juan");
		return "view";
	}	
	
	@GetMapping(value="/id")
	public String idWeb(Model model) {
		model.addAttribute("name", "Javier");
		return "view";
	}

	@Value("${texto.indexcontroller.index.titulo}")
	private String textoName;	
	
	@GetMapping(value="/name")
	public String nameWeb(Model model) {
		model.addAttribute("name", textoName);
		return "view";
	}
	
	@Value("${texto1.indexcontroller.index.titulo}")
	private String textoName1;
	
	@GetMapping(value="/name1")
	public String nameWeb1(Model model) {
		model.addAttribute("name", textoName1);
		return "view";
	}
	
	@RequestMapping("/user")
	public String user(Model model) {
		Usuario user = new Usuario();
		user.setNombre("Javier");
		user.setApellido1("GA");
		model.addAttribute("user", user);
		model.addAttribute("userName", user.getNombre() + " " + user.getApellido1());
		return "user";
	}
		
	@RequestMapping("/listuser1")
	public String listuser1(Model model) {		
		List<Usuario> users = new ArrayList<>();
		users.add(new Usuario("Jaime", "TG", "PL", ""));
		users.add(new Usuario("Pedro", "ES", "LM", ""));
		users.add(new Usuario("Ana", "AZ", "", "Uria"));
		model.addAttribute("users", users);		
		return "listUser1";
	}
		
	@RequestMapping("/listuser2")
	public String listuser2(Model model) {		
		List<Usuario> users = Arrays.asList(
				new Usuario("Jaime", "TG", "PL", ""),
				new Usuario("Pedro", "ES", "LM", ""),
				new Usuario("Ana", "AZ", "", "Uria")
		);
		model.addAttribute("users", users);		
		return "listUser2";
	}
	
	//in all methods
	@ModelAttribute("users")
	public List<Usuario> listUsers(){
		List<Usuario> users = Arrays.asList(
				new Usuario("Jaime", "TG", "PL", ""),
				new Usuario("Pedro", "ES", "LM", ""),
				new Usuario("Ana", "AZ", "", "Uria")
		);	
		return users;
	}
	

}
