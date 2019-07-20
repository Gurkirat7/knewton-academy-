package com.knewton.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class AttendanceCountId implements Serializable{
	private static final long serialVersionUID = 1L;
	@Column
    private String studentId;
	@Column
	private String batchId;
	
	
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	
	public AttendanceCountId() {
		// TODO Auto-generated constructor stub
	}
	
	public AttendanceCountId(String studentId, String batchId) {
		this.studentId = studentId;
		this.batchId = batchId;
	}
}
