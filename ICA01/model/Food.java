package com.vau.app.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "foods")
public class Food {

	@Id
	private Long id;
	private String name;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal price;
	
	@Column(nullable = false, precision = 10, scale = 2)
	private BigDecimal weight;
	
	@OneToMany(mappedBy = "food")
	private List<Menu_item> menu_items;
	
	@OneToMany(mappedBy = "food")
	private List<Order_line> oder_lines;

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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public List<Menu_item> getMenu_items() {
		return menu_items;
	}

	public void setMenu_items(List<Menu_item> menu_items) {
		this.menu_items = menu_items;
	}

	public List<Order_line> getOder_lines() {
		return oder_lines;
	}

	public void setOder_lines(List<Order_line> oder_lines) {
		this.oder_lines = oder_lines;
	}
	
	
}
