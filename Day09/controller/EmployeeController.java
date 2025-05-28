package com.employee.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.model.Employee;
import com.employee.app.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Employee>> getEmps(){
		return new ResponseEntity<List<Employee>>(service.getEmps(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmp(@PathVariable("id") String emp_id){
		Employee emp = service.getEmp(emp_id);
		if(emp == null) {
			return new ResponseEntity<>("Employee with ID: " + emp_id + " not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(service.getEmp(emp_id), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addEmp(@RequestBody Employee emp){
		if(emp != null) {
			return new ResponseEntity<String>(service.addEmp(emp), HttpStatus.OK);
		}
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmp(@PathVariable("id") String id, @RequestBody Employee emp){
		if(emp != null) {
			return new ResponseEntity<String>(service.updateEmp(id, emp), HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") String id){
		if(id != null) {
			return new ResponseEntity<String>(service.removeEmp(id), HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
}
