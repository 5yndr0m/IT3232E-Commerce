package com.vau.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vau.app.model.Department;

@Repository
public interface DepartmentRepo extends JpaRepository<Department, String>{

	@Query("SELECT depName FROM Department")
	public List<String> getDepartmentNames();
	
	@Query("SELECT d FROM Department d WHERE d.depName LIKE %?1%")
	public List<Department> findByName(String name);
}
