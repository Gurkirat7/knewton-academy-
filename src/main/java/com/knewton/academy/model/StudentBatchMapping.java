package com.knewton.academy.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentbatchmapping")
public class StudentBatchMapping {
	@Id
	private String studentId;
	
	@Id
	private String batchId;
	
	@OneToOne
	@JoinColumn(name="studentId", referencedColumnName="studentId")
	private StudentTable studenttable;
	
	@OneToOne
	@JoinColumn(name="batchId", referencedColumnName="batchId")
	private BatchCourseMapping batchcoursemapping;
	
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
	
	
	public StudentTable getStudenttable() {
		return studenttable;
	}

	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}

	public BatchCourseMapping getBatchcoursemapping() {
		return batchcoursemapping;
	}

	public void setBatchcoursemapping(BatchCourseMapping batchcoursemapping) {
		this.batchcoursemapping = batchcoursemapping;
	}

	public StudentBatchMapping() {
		
	}

}
