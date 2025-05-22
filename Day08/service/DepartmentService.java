package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vau.app.model.Department;
import com.vau.app.repo.DepartmentRepo;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepo repo;
	
	public List<Department> getDepts(){
		return repo.findAll();
	}
	
	public Department getDept(String dep_id) {
		return repo.findById(dep_id).get();
	}
	
	public String addDept(Department dept) {
		if(repo.findById(dept.getDepID()).isEmpty()) {
			repo.save(dept);
			return "New Department Added";
		}
		
		return "Department with ID: " + dept.getDepID() + " exists";
	}
	
	public String updateDept(String id, Department dept) {
		if(repo.existsById(id)) {
			repo.save(dept);
			return "Department Updated";
		}
		return "Department with ID: " + id + "does not exists"; 
	}
	
	public String deleteDept(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Department Removed";
		}
		return "Department with ID: " + id + "does not exists"; 
		
	}

}
