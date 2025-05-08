package com.vau.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_lines")
public class Order_line {

	@Id
	private Long id;
	
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Food_order order;
	
	@ManyToOne
	@JoinColumn(name = "food_id")
	private Food food;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Food_order getOrder() {
		return order;
	}

	public void setOrder(Food_order order) {
		this.order = order;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	
}
