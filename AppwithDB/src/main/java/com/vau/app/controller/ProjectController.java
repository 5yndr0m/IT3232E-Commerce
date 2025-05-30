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

import com.vau.app.model.Project;
import com.vau.app.service.ProjectService;

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
		return new ResponseEntity<>(service.getProj(proj_id), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addProj(@RequestBody Project proj){
		return new ResponseEntity<String>(service.addProj(proj), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateProj(@PathVariable("id") String id, @RequestBody Project proj){
		return new ResponseEntity<String>(service.updateProj(id, proj), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteProj(@PathVariable("id") String id){
		return new ResponseEntity<String>(service.removeProj(id), HttpStatus.OK);
	}
}
