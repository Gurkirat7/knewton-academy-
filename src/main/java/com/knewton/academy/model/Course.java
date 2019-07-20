package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="course")
public class Course {
	@Id
    private int courseId;
	@Column
	private String details;
	@OneToOne(mappedBy="course")
	private Test test;
	@OneToOne(mappedBy="course")
	private BatchCourseMapping batchcoursemapping;
		
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public BatchCourseMapping getBatchcoursemapping() {
		return batchcoursemapping;
	}

	public void setBatchcoursemapping(BatchCourseMapping batchcoursemapping) {
		this.batchcoursemapping = batchcoursemapping;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

}
