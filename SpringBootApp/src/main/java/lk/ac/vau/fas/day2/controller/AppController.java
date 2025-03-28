package lk.ac.vau.fas.day2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/msg")
	public String msg() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/wall")
	public String wall() {
		return "You hit a wall";
	}
}
