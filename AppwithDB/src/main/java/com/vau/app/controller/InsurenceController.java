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

import com.vau.app.model.Insurence;
import com.vau.app.service.InsurenceService;

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
		return new ResponseEntity<>(service.getIns(ins_id), HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addIns(@RequestBody Insurence ins){
		return new ResponseEntity<String>(service.addIns(ins), HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateIns(@PathVariable("id") String id, @RequestBody Insurence ins){
		return new ResponseEntity<String>(service.updateIns(id, ins), HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteIns(@PathVariable("id") String id){
		return new ResponseEntity<String>(service.removeIns(id), HttpStatus.OK);
	}
}
