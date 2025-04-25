package com.vau.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "presenter")
public class Presenter {

	@Id
	private String id; 
	private String email; 
	private String gender; 
	private String name; 
	private Integer phone;
	private String affiliation; 
	private String country; 
	private String job_title;
	
	@ManyToMany
	@JoinTable(name = "presenter_sessions",
	joinColumns = @JoinColumn(name = "sessions_id"),
	inverseJoinColumns = @JoinColumn(name = "presenters_id"))
	private List<Session> sessions;
}
