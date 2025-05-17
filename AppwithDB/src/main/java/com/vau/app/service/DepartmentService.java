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

}
