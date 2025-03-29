package lk.ac.vau.fas.sbapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	List<Student> students = new ArrayList<Student>();
	
	public StudentController() {
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
	}
	
	@GetMapping("/studetails")
	public Student getStudentDetails() {
		return s1;
	}
	
	@GetMapping("/info/all")
	public List<Student> getAllDetails(){
		return students;
	}
	
	@GetMapping("/info/{id}")
	public Student getStudentById(@PathVariable("id") String index) {
		for(Student student : students) {
			if(student.getRegNo().equals(index)) {
				return student;
			}
		}
		return null;
	}
}
