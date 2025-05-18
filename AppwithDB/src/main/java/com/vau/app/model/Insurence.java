package com.vau.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Insurence {

//	Attributes
	@Id
	private String insID;
	private String pkgType;
	private int noOfYears;
	@OneToOne(mappedBy = "insurence")
	private Employee employee;
	
	public Insurence() {
		
	}
	
	public Insurence(String insID, String pkgType, int noOfYears, Employee employee) {
		super();
		this.insID = insID;
		this.pkgType = pkgType;
		this.noOfYears = noOfYears;
		this.employee = employee;
	}

	public String getInsID() {
		return insID;
	}

	public void setInsID(String insID) {
		this.insID = insID;
	}

	public String getPkgType() {
		return pkgType;
	}

	public void setPkgType(String pkgType) {
		this.pkgType = pkgType;
	}

	public int getNoOfYears() {
		return noOfYears;
	}

	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
