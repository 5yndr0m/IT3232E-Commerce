package lk.ac.vau.fas.ict.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("students")
public class StudentController {
	
	Student JohnD = new Student("John Doe",24,"IT1001","DS",3.5);
	Student ChrisH = new Student("Chris Hemsworth",25,"IT1012","SE",3.2);
	Student JamesM = new Student("James Moriyati",23,"IT1005","ML",3.9);
	Student Alucard = new Student("Alucard",24,"IT1023","CS",3.5);
	Student Tesla = new Student("Tesla",22,"IT1030","PC",3.6);
	
	private List<Student> students = new ArrayList<Student>();
//	private Map<Key, Value> mstudents = new HashMap<Key, Value>();
	private Map<String, Student> mstudents = new HashMap<String, Student>();
	
	public StudentController() {
		students.add(JohnD);
		students.add(ChrisH);
		students.add(JamesM);
		students.add(Alucard);
		students.add(Tesla);
		
		mstudents.put(JohnD.getRegNo(), JohnD);
		mstudents.put(ChrisH.getRegNo(), ChrisH);
		mstudents.put(JamesM.getRegNo(), JamesM);
		mstudents.put(Alucard.getRegNo(), Alucard);
		mstudents.put(Tesla.getRegNo(), Tesla);
	}
	
	@GetMapping("/info")
	public Student displayStudent() {
		return JohnD;
	}

	@GetMapping("/info/all")
	/*public List<Student> displayAllStudents() {
		return students;
	}*/
	public Map<String, Student> displayAll(){
		return mstudents;
	}
	
	@GetMapping("/info/{index}")
	public Student getStudentByID(@PathVariable("index") String regNo) {
		/*for(Student student : students) {
			if(student.getRegNo().equals(index)) {
				return student;
			}
		}
		return null;*/
		return mstudents.get(regNo);
	}
	
	@PostMapping("/create")
	public String createStudent(@RequestBody Student student) {
		try {
			mstudents.put(student.getRegNo(), student);
			return "Student added succesfully";
		} catch(Exception e){
			return "Error : " + e.getMessage();
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") String regNo) {
		try {
			if(mstudents.get(regNo) != null) {
				mstudents.remove(regNo);
				return "Student deleted Successfully";
			}
			return "404 Couldn't find the student";
		} catch(Exception e) {
			return "Error : " + e.getMessage();
		}
	}
	
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable("id") String regNo, @RequestBody Student student) {
		try {
			if(mstudents.get(regNo) != null) {
				mstudents.put(student.getRegNo(), student);
				return "Student details updated Successfully";
			}
			return "404 Couldn't find the student";
		} catch(Exception e) {
			return "Error : " + e.getMessage();
		}
	}
	
	
}
