package com.vau.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee extends Person{

	@Id
	private Long id;
	
	private String jobPosition;
	
	@ManyToMany
	@JoinTable(name = "employee_canteen",
	joinColumns = @JoinColumn(name = "employee_id"),
	inverseJoinColumns = @JoinColumn(name = "canteen_id"))
	private List<Canteen> canteens;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public List<Canteen> getCanteens() {
		return canteens;
	}

	public void setCanteens(List<Canteen> canteens) {
		this.canteens = canteens;
	}
	
	
}
