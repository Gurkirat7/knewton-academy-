package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usertype")
public class Usertype {
	@Id
	private int userTypeId;
	
	@Column
	private String userType;
	
	@OneToOne(mappedBy="usertype")
	private EmployeeTable employeetable;
	@OneToOne(mappedBy="usertype")
	private Login login;
	
	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public EmployeeTable getEmployeetable() {
		return employeetable;
	}

	public void setEmployeetable(EmployeeTable employeetable) {
		this.employeetable = employeetable;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Usertype() {
		// TODO Auto-generated constructor stub
	}

}
