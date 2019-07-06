package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="batchcoursemapping")
public class BatchCourseMapping {
	@Id
	private String batchId;
	
	@Column
	private int courseId;
	
	@OneToOne
	@JoinColumn(name="courseId", referencedColumnName="courseId")
	private Course course;
	
	
	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
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


	public BatchCourseMapping() {
		// TODO Auto-generated constructor stub
	}

}
