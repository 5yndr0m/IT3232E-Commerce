package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("app")
public class AppController {
	
	@GetMapping("/msg")
	public String myMessage() {
		return "Hello World!";
	}

	@GetMapping("/name/{nm}")
	public String getName(@PathVariable("nm") String name) {
		return "My name is " + name;
	}
	
	@GetMapping("/name")
	public String myName() {
		return "My name is Senal";
	}
	
	@GetMapping("/age/{ag}") //path variable
	public String getAge(@PathVariable("ag") int age) {
		return "Age is : " + age;
	}
	
	@GetMapping("/info/{nm},{ag},{index}")
	public String getInfo(@PathVariable("nm") String name, @PathVariable("ag") int age, @PathVariable("index") String index) {
		return "Name : " + name + " \nAge : " + age + "\nIndex : " + index;
	}
}
