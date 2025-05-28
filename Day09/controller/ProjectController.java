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

import com.employee.app.model.Project;
import com.employee.app.service.ProjectService;

@RestController
@RequestMapping("/proj")
public class ProjectController {

	@Autowired
	private ProjectService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Project>> getProjs(){
		return new ResponseEntity<List<Project>>(service.getProjs(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProj(@PathVariable("id") String proj_id){
		Project proj = service.getProj(proj_id);
		if(proj == null) {
			return new ResponseEntity<>("Project with ID: " + proj_id + " not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(service.getProj(proj_id), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addEmp(@RequestBody Project proj){
		if(proj != null) {
			return new ResponseEntity<String>(service.addProj(proj), HttpStatus.OK);
		}
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmp(@PathVariable("id") String id, @RequestBody Project proj){
		if(proj != null) {
			return new ResponseEntity<String>(service.updateProj(id, proj), HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") String id){
		if(id != null) {
			return new ResponseEntity<String>(service.removeProj(id), HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
}
