package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="attendance")
public class Attendance {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
    private int classDeliveredId;
	@Id
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

	public Attendance() {
		// TODO Auto-generated constructor stub
	}

}
