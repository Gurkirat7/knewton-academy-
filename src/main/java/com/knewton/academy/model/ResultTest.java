package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="result_test")
public class ResultTest {
	@EmbeddedId
	private ResultTestId resulttestid;
	@Column
	private int obtainedMarks;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="studentId",referencedColumnName="studentId", insertable=false,updatable=false)
	private StudentTable studenttable;
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="testId",referencedColumnName="testId", insertable=false,updatable=false)
	private Test test;
	
	public ResultTestId getResulttestid() {
		return resulttestid;
	}


	public void setResulttestid(ResultTestId resulttestid) {
		this.resulttestid = resulttestid;
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


	public Test getTest() {
		return test;
	}


	public void setTest(Test test) {
		this.test = test;
	}


	public ResultTest() {
		
	}
	public ResultTest(ResultTestId resulttestid, int obtainedMarks) {
		this.resulttestid = resulttestid;
		this.obtainedMarks = obtainedMarks;
	}
}

