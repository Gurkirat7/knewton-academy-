package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="testserieslogin")
public class TestSeriesLogin {
	@Id
	private String studentId;
	@Column
	private String testId;	
	@Column
	private String testpassword;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="studentId" , referencedColumnName="studentId",insertable=false,updatable=false)
	private StudentTable studenttable;

	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public String getTestpassword() {
		return testpassword;
	}

	public void setTestpassword(String testpassword) {
		this.testpassword = testpassword;
	}

	public StudentTable getStudenttable() {
		return studenttable;
	}

	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}

	public TestSeriesLogin() {
		// TODO Auto-generated constructor stub
	}

}
