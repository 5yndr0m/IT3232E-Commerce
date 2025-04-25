package com.vau.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "post_graduate")
public class PostGraduate extends Graduate{

	@Id
	private String id; 

	private String institute; 
	private String research_interest; 
	private String second_degree;
	
	@ManyToMany
	@JoinTable(name = "post_graduate_sessions",
	joinColumns = @JoinColumn(name = "sessions_id"),
	inverseJoinColumns = @JoinColumn(name = "post_graduates_id"))
	private List<Session> join_sessions;
}
