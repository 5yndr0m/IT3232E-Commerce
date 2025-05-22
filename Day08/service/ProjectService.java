package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vau.app.model.Project;
import com.vau.app.repo.ProjectRepo;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepo repo;
	
	public List<Project> getProjs(){
		return repo.findAll();
	}
	
	public Project getProj(String id) {
		return repo.findById(id).get();
	}
	
	public String addProj(Project proj) {
		if(repo.findById(proj.getProjectID()).isEmpty()) {
			repo.save(proj);
			return "Project Addded";
		}
		
		return "Project exists";
	}
	
	public String updateProj(String id, Project proj) {
		if(repo.existsById(id)) {
			repo.save(proj);
			return "Project Updated";
		}
		return "Project not found";
	}
	
	public String removeProj(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Project removed";
		}
		return "Project not found";
	}
}
