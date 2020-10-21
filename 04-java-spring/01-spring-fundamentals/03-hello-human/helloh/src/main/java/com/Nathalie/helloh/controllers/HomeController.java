package com.Nathalie.helloh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloHuman() {
	//	return "Welcome to Spring Boot";
			return "helloh.jsp";
	}
	@RequestMapping(value = "/{fname}", method = RequestMethod.GET)
	public String Hello(@PathVariable("fname")String fname, Model viewModel) {
	viewModel.addAttribute("first name", fname);
	return "Helloname.jsp";
	}
}