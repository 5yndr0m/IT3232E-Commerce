package com.vau.app.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "food_orders")
public class Food_order {

	@Id
	private Long id;
	
	private LocalDateTime order_date;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student students;
	
	@OneToMany(mappedBy = "order")
	private List<Order_line> order_line;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDateTime order_date) {
		this.order_date = order_date;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public List<Order_line> getOrder_line() {
		return order_line;
	}

	public void setOrder_line(List<Order_line> order_line) {
		this.order_line = order_line;
	}
	
	
}
