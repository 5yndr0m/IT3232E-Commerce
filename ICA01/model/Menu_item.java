package com.vau.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "menu_items")
public class Menu_item {

	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "daily_menu")
	private Daily_menu daily_menu;
	
	@ManyToOne
	@JoinColumn(name = "food_id")
	private Food food;
	
	private Integer availableQuantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Daily_menu getDaily_menu() {
		return daily_menu;
	}

	public void setDaily_menu(Daily_menu daily_menu) {
		this.daily_menu = daily_menu;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	
}
