package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.vau.app.model.Insurence;
import com.vau.app.repo.InsurenceRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class InsurenceService {

	@Autowired
	private InsurenceRepo repo;
	
	public List<Insurence>   getInsurences(){
		return repo.findAll();
	}
	
	public Insurence getIns(String id) {
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Insurence plan not found");
		}
		return repo.findById(id).get();
	}
	
	public String addIns(Insurence ins) {
		if(repo.findById(ins.getInsID()).isEmpty()) {
			repo.save(ins);
			return "Insurence Added";
		}
		throw new DuplicateKeyException("Insurence plan exists");
	}
	
	public String updateIns(String id, Insurence ins) {
		if(repo.existsById(id)) {
			repo.save(ins);
			return "Insurence updated";
		}
		throw new EntityNotFoundException("Insurence plan not found");
	}
	
	public String removeIns(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Insurence removed";
		}
		throw new EntityNotFoundException("Insurence plan not found");
	}
}
