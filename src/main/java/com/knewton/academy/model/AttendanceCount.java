package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="attendancecount")
public class AttendanceCount {
	@EmbeddedId
	private AttendanceCountId attendancecountid;
	@Column
	private int totalCount;
	@Column
	private int presentCount;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="studentId", referencedColumnName="studentId", insertable=false,updatable=false)
	private StudentTable studenttable;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name="batchId", referencedColumnName="batchId", insertable=false,updatable=false)
	private BatchCourseMapping batchcoursemapping;

	public AttendanceCountId getAttendancecountid() {
		return attendancecountid;
	}


	public void setAttendancecountid(AttendanceCountId attendancecountid) {
		this.attendancecountid = attendancecountid;
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
	public AttendanceCount() {
		// TODO Auto-generated constructor stub
	}
	public AttendanceCount(AttendanceCountId attendancecountid, int totalCount, int presentCount) {
		this.attendancecountid = attendancecountid;
		this.totalCount = totalCount;
		this.presentCount = presentCount;
	}
}
