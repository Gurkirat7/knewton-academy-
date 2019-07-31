package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="attendance")
public class Attendance {
	
	@EmbeddedId
	private AttendanceId attendanceid;
	@Column
	private boolean attendance;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="classDeliveredId", referencedColumnName="classDeliveredId", insertable=false,updatable=false)
	private ClassDelivered classdelivered;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="studentId", referencedColumnName="studentId", insertable=false,updatable=false)
	private StudentTable studenttable;

	
	public AttendanceId getAttendanceid() {
		return attendanceid;
	}


	public void setAttendanceid(AttendanceId attendanceid) {
		this.attendanceid = attendanceid;
	}
	
	
	public boolean isAttendance() {
		return attendance;
	}


	public void setAttendance(boolean attendance) {
		this.attendance = attendance;
	}


	public ClassDelivered getClassdelivered() {
		return classdelivered;
	}


	public void setClassdelivered(ClassDelivered classdelivered) {
		this.classdelivered = classdelivered;
	}


	public StudentTable getStudenttable() {
		return studenttable;
	}


	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}
	
	public Attendance() {
		// TODO Auto-generated constructor stub
	}
	public Attendance(AttendanceId attendanceid) {
		this.attendanceid = attendanceid;
	}

}
