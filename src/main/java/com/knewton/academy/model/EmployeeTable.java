package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employeetable")
public class EmployeeTable {

	@Id
	@Column
    private String employeeId;
	@Column
	private String name;
	@Column
	private int userTypeId;
	@Column
	private int contactDetails;
	@Column
	private String emailId;
	@Column
	private String address;
	@Column
	private int salary;
	
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getUserTypeId() {
		return userTypeId;
	}


	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}


	public int getContactDetails() {
		return contactDetails;
	}


	public void setContactDetails(int contactDetails) {
		this.contactDetails = contactDetails;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public EmployeeTable() {
		// TODO Auto-generated constructor stub
	}

}
