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
	@JoinColumn(name="userTypeId", referencedColumnName="userTypeId", insertable=false,updatable=false)
	private Usertype usertype;

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
	
	public Usertype getUsertype() {
		return usertype;
	}

	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}

	public Login() {
		// TODO Auto-generated constructor stub
	}

}
