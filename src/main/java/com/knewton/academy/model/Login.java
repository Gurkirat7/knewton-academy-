package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	@Column
	private String id;
	@Column
    private String password;
	@Column
	private int userTypeId;
	
	@OneToOne
	@JoinColumn(name="userTypeId", referencedColumnName="userTypeId")
	private EmployeeTable employeetable;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}
	public EmployeeTable getEmployeetable() {
		return employeetable;
	}

	public void setEmployeetable(EmployeeTable employeetable) {
		this.employeetable = employeetable;
	}

	public Login() {
		// TODO Auto-generated constructor stub
	}

}
