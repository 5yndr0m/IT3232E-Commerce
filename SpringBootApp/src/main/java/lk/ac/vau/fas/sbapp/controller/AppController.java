package lk.ac.vau.fas.sbapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

	@GetMapping("/msg")
	public String msg() {
		return "Hello Spring Boot";
	}
	
	@GetMapping("/name")
	public String displayName() {
		return "I'm John Doe";
	}
	
	@GetMapping("/name/{nm}")
	public String displayName(@PathVariable("nm") String name) {
		return "Name is " + name;
	}
	
	@GetMapping("/age/{ag}")
	public String displayAge(@PathVariable("ag") int age) {
		return "Age is " + age;
	}
}
