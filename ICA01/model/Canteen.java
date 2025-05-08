package com.vau.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "canteens")
public class Canteen {

	@Id
	private Long id;
	private String name;
	private String location;
	
	@OneToMany(mappedBy = "canteen")
	private List<Daily_menu> daily_menus;
	
	@ManyToMany(mappedBy = "canteens")
	private List<Employee> employees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Daily_menu> getDaily_menus() {
		return daily_menus;
	}

	public void setDaily_menus(List<Daily_menu> daily_menus) {
		this.daily_menus = daily_menus;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
}
