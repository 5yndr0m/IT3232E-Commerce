package com.employee.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.employee.app.model.Department;
import com.employee.app.repo.DepartmentRepo;

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
			throw new EntityNotFoundException("Department with id " + dep_id + " does not exist");
		}
		return repo.findById(dep_id).get();
	}
	
	public String addDept(Department dept) {
		if(repo.findById(dept.getDepID()).isPresent()) {
			throw new DuplicateKeyException("Department with ID: " + dept.getDepID() + " exists");
		}
		repo.save(dept);
		return "New Department Added";
		
	}
	
	public String updateDept(String id, Department dept){
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Department with id " + id + " does not exist");
		}
		repo.save(dept);
		return "Department Updated";
	}
	
	public String deleteDept(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Department Removed";
		}
		return "Department with ID: " + id + "does not exists"; 
		
	}
}
