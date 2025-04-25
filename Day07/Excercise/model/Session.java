package com.vau.app.model;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "session")
public class Session {

	@Id
	private String id; 
	private Date date; 
	private String description;
	private String name;
	private Time time;
	
	@ManyToOne
	private Workshop workshop;
	
	@ManyToMany(mappedBy = "sessions")
	private List<Presenter> presenters;
	
	@ManyToMany(mappedBy = "join_sessions")
	private List<PostGraduate> post_grds;
	
	@ManyToMany(mappedBy = "usessions")
	private List<UnderGraduate> undr_grads;
}
