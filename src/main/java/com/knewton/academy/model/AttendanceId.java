package com.knewton.academy.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Embeddable
public class AttendanceId implements Serializable{

	@Column
    private int classDeliveredId;
	
	@Column
	private String studentId;
	
	
	
	public int getClassDeliveredId() {
		return classDeliveredId;
	}


	public void setClassDeliveredId(int classDeliveredId) {
		this.classDeliveredId = classDeliveredId;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public AttendanceId() {
		// TODO Auto-generated constructor stub
	}
	public AttendanceId(int classDeliveredId , String studentId) {
		this.classDeliveredId = classDeliveredId;
		this.studentId = studentId;
	}

}
