package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("students")
public class StudentController extends CRUDController<String, Student> {

	
	public StudentController() {
		Student JohnD = new Student("John Doe",24,"IT1001","DS",3.5);
		Student ChrisH = new Student("Chris Hemsworth",25,"IT1012","SE",3.2);
		Student JamesM = new Student("James Moriyati",23,"IT1005","ML",3.9);
		Student Alucard = new Student("Alucard",24,"IT1023","CS",3.5);
		Student Tesla = new Student("Tesla",22,"IT1030","PC",3.6);
		
		getMap().put(JohnD.getRegNo(), JohnD);
		getMap().put(ChrisH.getRegNo(), ChrisH);
		getMap().put(JamesM.getRegNo(), JamesM);
		getMap().put(Alucard.getRegNo(), Alucard);
		getMap().put(Tesla.getRegNo(), Tesla);
	}
	
}
