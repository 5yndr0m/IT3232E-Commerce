package com.employee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.app.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, String> {
	
	

}
