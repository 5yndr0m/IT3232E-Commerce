package com.vau.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import com.vau.app.model.Project;
import com.vau.app.repo.ProjectRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepo repo;
	
	public List<Project> getProjs(){
		return repo.findAll();
	}
	
	public Project getProj(String id) {
		if(repo.findById(id).isEmpty()) {
			throw new EntityNotFoundException("Project not found");
		}
		return repo.findById(id).get();
	}
	
	public String addProj(Project proj) {
		if(repo.findById(proj.getProjectID()).isEmpty()) {
			repo.save(proj);
			return "Project Addded";
		}
		
		throw new DuplicateKeyException("Project exists");
	}
	
	public String updateProj(String id, Project proj) {
		if(repo.existsById(id)) {
			repo.save(proj);
			return "Project Updated";
		}
		throw new EntityNotFoundException("Project not found");
	}
	
	public String removeProj(String id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
			return "Project removed";
		}
		throw new EntityNotFoundException("Project not found");
	}
}
