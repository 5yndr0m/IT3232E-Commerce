package com.vau.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vau.app.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, String>{

	@Query("SELECT e FROM Employee e WHERE e.salary BETWEEN %?1% AND %?2%")
	public List<Employee> findInRange(int min, int max);
	
	@Query("SELECT e FROM Employee e WHERE e.age = (SELECT MIN(age) FROM Employee)")
	public Employee findYoungest();
}
