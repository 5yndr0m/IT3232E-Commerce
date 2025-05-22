package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vau.app.model.Insurence;
import com.vau.app.repo.InsurenceRepo;

@Service
public class InsurenceService {

	@Autowired
	private InsurenceRepo repo;
	
	public List<Insurence>   getInsurences(){
		return repo.findAll();
	}
	
	public Insurence getIns(String id) {
		return repo.findById(id).get();
	}
	
	public String addIns(Insurence ins) {
		if(repo.findById(ins.getInsID()).isEmpty()) {
			repo.save(ins);
			return "Insurence Added";
		}
		return "Insurence exists";
	}
	
	public String updateIns(String id, Insurence ins) {
		if(repo.existsById(id)) {
			repo.save(ins);
			return "Insurence updated";
		}
		return "Insurence not found";
	}
	
	public String removeIns(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Insurence removed";
		}
		return "Insurence not found";
	}
}
