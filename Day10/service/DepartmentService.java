package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.vau.app.model.Department;
import com.vau.app.repo.DepartmentRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDepts(){
		return repo.findAll();
	}
	
	public Department getDept(String dep_id) {
		if(repo.findById(dep_id).isEmpty()) {
			throw new EntityNotFoundException("Department not found");
		}
		return repo.findById(dep_id).get();
	}
	
	public String addDept(Department dept) {
		if(repo.findById(dept.getDepID()).isPresent()) {
			throw new DuplicateKeyException("Department exists");
		}
		
		repo.save(dept);
		return "New Department Added";
	}
	
	public String updateDept(String id, Department dept) {
		if(repo.existsById(id)) {
			repo.save(dept);
			return "Department Updated";
		}
		throw new EntityNotFoundException("Department not found");
	}
	
	public String deleteDept(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Department Removed";
		}
		throw new EntityNotFoundException("Department not found");
		
	}
	
	public List<String> getDepartmentNames(){
		if(repo.getDepartmentNames().isEmpty()) {
			throw new EntityNotFoundException("No Department found");
		}
		return repo.getDepartmentNames();
	}
	
	public List<Department> findByName(String name){
		if(repo.findByName(name).isEmpty()) {
			throw new EntityNotFoundException("No Department found");
		}
		
		return repo.findByName(name);
	}

}
