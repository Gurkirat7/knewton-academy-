package com.knewton.academy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacherbatchmapping")
public class TeacherBatchMapping {
	@Id
	private String employeeId;
	
	@Id
	private String batchId;
	
	@OneToOne
	@JoinColumn(name="employeeId", referencedColumnName="employeeId")
	private EmployeeTable employeetable;
	
	@OneToOne
	@JoinColumn(name="batchId", referencedColumnName="batchId")
	private BatchCourseMapping batchcoursemapping;

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


	public EmployeeTable getEmployeetable() {
		return employeetable;
	}

	public void setEmployeetable(EmployeeTable employeetable) {
		this.employeetable = employeetable;
	}

	public BatchCourseMapping getBatchcoursemapping() {
		return batchcoursemapping;
	}

	public void setBatchcoursemapping(BatchCourseMapping batchcoursemapping) {
		this.batchcoursemapping = batchcoursemapping;
	}
	public TeacherBatchMapping() {
		
	}
	
}
