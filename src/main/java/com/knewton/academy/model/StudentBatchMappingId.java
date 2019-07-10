package com.knewton.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class StudentBatchMappingId implements Serializable{
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


	public StudentBatchMappingId() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentBatchMappingId(String studentId, String batchId) {
		this.studentId = studentId;
		this.batchId = batchId;
	}
}
