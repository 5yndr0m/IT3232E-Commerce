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

import com.employee.app.model.Insurence;
import com.employee.app.service.InsurenceService;

@RestController
@RequestMapping("/ins")
public class InsurenceController {

	@Autowired
	private InsurenceService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Insurence>> getInsurences(){
		return new ResponseEntity<List<Insurence>>(service.getInsurences(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getIns(@PathVariable("id") String ins_id){
		Insurence ins = service.getIns(ins_id);
		if(ins == null) {
			return new ResponseEntity<>("Insurence with ID: " + ins_id + " not found", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(service.getIns(ins_id), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addIns(@RequestBody Insurence ins){
		if(ins != null) {
			return new ResponseEntity<String>(service.addIns(ins), HttpStatus.OK);
		}
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateIns(@PathVariable("id") String id, @RequestBody Insurence ins){
		if(ins != null) {
			return new ResponseEntity<String>(service.updateIns(id, ins), HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") String id){
		if(id != null) {
			return new ResponseEntity<String>(service.removeIns(id), HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No data provided", HttpStatus.BAD_REQUEST);
	}
}
