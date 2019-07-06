package com.knewton.academy.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attendancecount")
public class AttendanceCount {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String studentId;
	@Column
	private String batchId;
	@Column
	private int totalCount;
	@Column
	private int presentCount;
	

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


	public int getTotalCount() {
		return totalCount;
	}


	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}


	public int getPresentCount() {
		return presentCount;
	}


	public void setPresentCount(int presentCount) {
		this.presentCount = presentCount;
	}


	public AttendanceCount() {
		// TODO Auto-generated constructor stub
	}

}
