package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vau.app.model.Employee;
import com.vau.app.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;

	public List<Employee> getEmps(){
		return repo.findAll();
	}
	
	public Employee getEmp(String id) {
		return repo.findById(id).get();
	}
	
	public String addEmp(Employee emp) {
		if(repo.findById(emp.getEmpID()).isEmpty()) {
			repo.save(emp);
			return "Employee Added"; 
		}
		return "Employee already exists";
	}
	
	public String updateEmp(String id, Employee emp) {
		if(repo.existsById(id)) {
			repo.save(emp);
			return "Employee Updated";
		}
		return "Employee not found";
	}
	
	public String removeEmp(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Employee removed";
		}
		
		return "Employee not found";
	}
}
