package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.vau.app.model.Employee;
import com.vau.app.repo.EmployeeRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;

	public List<Employee> getEmps(){
		return repo.findAll();
	}
	
	public Employee getEmp(String id) {
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Employee not found");
		}
		return repo.findById(id).get();
	}
	
	public String addEmp(Employee emp) {
		if(repo.findById(emp.getEmpID()).isEmpty()) {
			repo.save(emp);
			return "Employee Added"; 
		}
		throw new DuplicateKeyException("Employee exists");
	}
	
	public String updateEmp(String id, Employee emp) {
		if(repo.existsById(id)) {
			repo.save(emp);
			return "Employee Updated";
		}
		throw new EntityNotFoundException("Employee not found");
	}
	
	public String removeEmp(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Employee removed";
		}
		
		throw new EntityNotFoundException("Employee not found");
	}
	
	public List<Employee> findInRange(int min, int max){
		if(repo.findInRange(min, max).isEmpty()) {
			throw new EntityNotFoundException("Employees not found in that salary range");
		}
		return repo.findInRange(min, max);
	}
	
	public Employee findYoungest() {
		return repo.findYoungest();
	}
}
