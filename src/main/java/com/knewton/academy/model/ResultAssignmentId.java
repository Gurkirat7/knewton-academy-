package com.knewton.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class ResultAssignmentId implements Serializable{
	@Column
	private String studentId;
	@Column
	private int assignmentId;

	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public int getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	public ResultAssignmentId() {
		// TODO Auto-generated constructor stub
	}
	public ResultAssignmentId(String studentId,int assignmentId) {
		this.studentId = studentId;
		this.assignmentId = assignmentId;
	}
	
	

}
