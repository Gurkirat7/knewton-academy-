package com.knewton.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class ResultTestId implements Serializable{
	@Column
	private String studentId;
	@Column
	private int testId;
	
	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public int getTestId() {
		return testId;
	}


	public void setTestId(int testId) {
		this.testId = testId;
	}


	public ResultTestId() {
		// TODO Auto-generated constructor stub
	}
	
	public ResultTestId(String studentId, int testId) {
		this.studentId = studentId;
		this.testId = testId;
	}
}
