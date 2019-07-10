package com.knewton.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class TeacherBatchMappingId implements Serializable{
	@Column
	private String employeeId;
	
	@Column
	private String batchId;
	
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}


	

	public TeacherBatchMappingId() {
		// TODO Auto-generated constructor stub
	}

	public TeacherBatchMappingId(String employeeId, String batchId) {
		this.employeeId = employeeId;
		this.batchId = batchId;
	}
}
