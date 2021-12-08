package com.coforge.training.model;

import javax.persistence.Entity;

//Model class

@Entity
public class Employee {
	private Long empId;
	private String firstName;
	private String lastName;
	
	public Long getEmpId() {
		return empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
