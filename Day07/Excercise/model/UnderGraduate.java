package com.vau.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "under_graduate")
public class UnderGraduate extends Graduate{

	@Id
	private String id; 
	
	private String degree; 
	private String university;
	
	@ManyToMany
	@JoinTable(name = "under_graduate_sessions",
	joinColumns = @JoinColumn(name = "sessions_id"),
	inverseJoinColumns = @JoinColumn(name = "under_graduates_id"))
	private List<Session> usessions;
}
