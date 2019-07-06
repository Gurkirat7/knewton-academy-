package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="result_test")
public class ResultTest {
	@Id
	@Column
	private String studentId;
	@Id
	@Column
	private int testId;
	@Column
	private int obtainedMarks;
	
	@OneToOne
	@JoinColumn(name="studentId",referencedColumnName="studentId")
	private StudentTable studenttable;
	
	@OneToOne
	@JoinColumn(name="testId",referencedColumnName="testId")
	private Test test;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public StudentTable getStudenttable() {
		return studenttable;
	}

	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}
	
	public ResultTest() {
		
	}
}

