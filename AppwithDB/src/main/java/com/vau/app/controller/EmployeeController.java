package com.vau.app.controller;

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

import com.vau.app.model.Employee;
import com.vau.app.service.EmployeeService;

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
		return new ResponseEntity<>(service.getEmp(emp_id), HttpStatus.OK);
	}
	
	@GetMapping("/find/range/{min}/{max}")
	public ResponseEntity<List<Employee>> findInRange(@PathVariable("min") int min,@PathVariable("max") int max){
		return new ResponseEntity<List<Employee>>(service.findInRange(min, max), HttpStatus.OK);
	}
	
	@GetMapping("/find/age/youngest")
	public ResponseEntity<Employee> findYoungest(){
		return new ResponseEntity<Employee>(service.findYoungest(), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addEmp(@RequestBody Employee emp){
		return new ResponseEntity<String>(service.addEmp(emp), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmp(@PathVariable("id") String id, @RequestBody Employee emp){
		return new ResponseEntity<String>(service.updateEmp(id, emp), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") String id){
		return new ResponseEntity<String>(service.removeEmp(id), HttpStatus.OK);
	}
}
