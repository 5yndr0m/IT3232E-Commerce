package com.vau.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
		Department dep = service.getDept(dep_id);
		if(dep == null) {
			return new ResponseEntity<>("Department with ID: " + dep_id + " not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(service.getDept(dep_id), HttpStatus.OK);
	}
}
