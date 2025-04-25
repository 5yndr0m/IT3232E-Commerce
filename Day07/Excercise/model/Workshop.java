package com.vau.app.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="workshop")
public class Workshop {

	@Id
	private int workshop_id;
	private String description;
	private String name;
	private Date start_date;
	private Date end_date;
	
	@OneToMany(mappedBy = "workshop")
	private List<Session> sessions;
}
