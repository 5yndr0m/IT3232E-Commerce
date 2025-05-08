package com.vau.app.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student extends Person{
	
	@Id
	private Long id;
	
	private String academic_degree;
	
	@OneToMany(mappedBy = "students")
	private List<Food_order> orders;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcademic_degree() {
		return academic_degree;
	}

	public void setAcademic_degree(String academic_degree) {
		this.academic_degree = academic_degree;
	}

	public List<Food_order> getOrders() {
		return orders;
	}

	public void setOrders(List<Food_order> orders) {
		this.orders = orders;
	}

	
}
