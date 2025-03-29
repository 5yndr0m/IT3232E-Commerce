package lk.ac.vau.fas.sbapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Student;

@RestController
@RequestMapping("/app/student")
public class StudentController {

	Student s1 = new Student("Bob",24,"IT1001","DS",3.4);
	Student s2 = new Student("Alice",23,"IT1013","SE",3.7);
	Student s3 = new Student("Jhon",22,"IT1045","ML",3.1);
	Student s4 = new Student("Jack",24,"IT1030","AI",2.9);
	Student s5 = new Student("Brian",22,"IT1060","DS",3.6);
	
	@GetMapping("/studetails")
	public Student getStudentDetails() {
		return s1;
	}
}
