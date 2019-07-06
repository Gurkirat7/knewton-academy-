package com.knewton.academy.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Test {
	@Id
	private int testId;
	
	@Column
	private int courseId;
	
	@Column
	private Time startTime;
	
	@Column
	private Time endTime;
	
	@Column
	private Date startDate;
	
	@Column
	private int totalMarks;
	
	@OneToOne
	@JoinColumn(name="courseId", referencedColumnName="courseId")
	private Course course;
	
	

	public int getTestId() {
		return testId;
	}



	public void setTestId(int testId) {
		this.testId = testId;
	}



	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public Time getStartTime() {
		return startTime;
	}



	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}



	public Time getEndTime() {
		return endTime;
	}



	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public int getTotalMarks() {
		return totalMarks;
	}



	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}



	public Course getCourse() {
		return course;
	}



	public void setCourse(Course course) {
		this.course = course;
	}



	public Test() {
		// TODO Auto-generated constructor stub
	}

}
