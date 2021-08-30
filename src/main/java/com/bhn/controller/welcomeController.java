package com.bhn.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
	@GetMapping("/welcome")
public String welcome(Model model) {
		model.addAttribute("message", "Hello World ! ");
	return "welcome";
}
}
