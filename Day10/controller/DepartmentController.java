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

import com.vau.app.model.Department;
import com.vau.app.service.DepartmentService;

@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Department>> getDepts(){
		return new ResponseEntity<List<Department>>(service.getDepts(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDept(@PathVariable("id") String dep_id){
		return new ResponseEntity<>(service.getDept(dep_id), HttpStatus.OK);
	}
	
	@GetMapping("/getby/names")
	public ResponseEntity<List<String>> getDeptNames(){
		return new ResponseEntity<List<String>>(service.getDepartmentNames(), HttpStatus.OK);
	}
	
	@GetMapping("/findby/name")
	public ResponseEntity<List<Department>> findByName(String name){
		return new ResponseEntity<List<Department>>(service.findByName(name), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addDept(@RequestBody Department dept){
		return new ResponseEntity<String>(service.addDept(dept), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateDept(@PathVariable("id") String id, @RequestBody Department dept){
		return new ResponseEntity<String>(service.updateDept(id, dept), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteDept(@PathVariable("id") String id){
		return new ResponseEntity<String>(service.deleteDept(id), HttpStatus.OK);
	}
}
