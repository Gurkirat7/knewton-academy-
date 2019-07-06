package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="test_series_login")
public class TestSeriesLogin {
	@Id
	private String testLoginId;
	
	@Column
	private String password;
	
	public String getTestLoginId() {
		return testLoginId;
	}

	public void setTestLoginId(String testLoginId) {
		this.testLoginId = testLoginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public TestSeriesLogin() {
		// TODO Auto-generated constructor stub
	}

}
