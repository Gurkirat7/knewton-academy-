package com.knewton.academy.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="batchcoursemapping")
public class BatchCourseMapping {
	@Id
	private String batchId;
	@Column
	private String batchName;
	@Column
	private int courseId;
	@OneToMany(mappedBy="batchcoursemapping")
	private Set<AttendanceCount> attendancecount;
	@OneToMany(mappedBy="batchcoursemapping")
	private Set<ClassDelivered> classdelivered;
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="courseId", referencedColumnName="courseId", insertable=false,updatable=false)
	private Course course;
	
	
	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	
	public Set<ClassDelivered> getClassdelivered() {
		return classdelivered;
	}


	public void setClassdelivered(Set<ClassDelivered> classdelivered) {
		this.classdelivered = classdelivered;
	}


	public String getBatchName() {
		return batchName;
	}


	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Set<AttendanceCount> getAttendancecount() {
		return attendancecount;
	}


	public void setAttendancecount(Set<AttendanceCount> attendancecount) {
		this.attendancecount = attendancecount;
	}


	public BatchCourseMapping() {
		// TODO Auto-generated constructor stub
	}

}
