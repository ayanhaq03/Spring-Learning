package com.example.demo;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
	
	@GetMapping("/web")
	public String hello() {
		return "hello" ;
	}
	
	@GetMapping("/web/message")
	public String message(Model model) {
		model.addAttribute("message","Hello from BridgeLabz ayan");
		return "message" ;
	}
	

}
