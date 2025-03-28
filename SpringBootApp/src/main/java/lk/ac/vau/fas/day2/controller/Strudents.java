package lk.ac.vau.fas.day2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Strudents {

	public String name = "John Doe";
	public String regNo = "IT12521";
	
	@GetMapping("/details")
	public String displayInfo() {
		return "Name : " + name + " | Registration no. : " + regNo;
	}
}
