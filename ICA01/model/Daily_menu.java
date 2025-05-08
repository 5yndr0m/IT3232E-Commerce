package com.vau.app.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "daily_menus")
public class Daily_menu {

	@Id
	private Long id;
	
	@Column(nullable = false)
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "canteen_id", nullable = false)
	private Canteen canteen;
	
	@OneToMany(mappedBy = "daily_menu")
	private List<Menu_item> menu_items;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Canteen getCanteen() {
		return canteen;
	}

	public void setCanteen(Canteen canteen) {
		this.canteen = canteen;
	}

	public List<Menu_item> getMenu_items() {
		return menu_items;
	}

	public void setMenu_items(List<Menu_item> menu_items) {
		this.menu_items = menu_items;
	}
	
	
}
