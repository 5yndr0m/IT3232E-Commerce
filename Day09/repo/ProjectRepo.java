package com.employee.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.model.Project;

public interface ProjectRepo extends JpaRepository<Project, String>{

}
