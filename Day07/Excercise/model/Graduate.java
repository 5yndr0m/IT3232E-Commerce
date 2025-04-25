package com.vau.app.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Graduate {

	private String email; 
	private String gender; 
	private String name; 
	private Integer phone;
}
