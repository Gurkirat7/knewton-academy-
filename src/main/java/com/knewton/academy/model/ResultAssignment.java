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
@Table(name="result_assignment")
public class ResultAssignment{
	
	@EmbeddedId
	private ResultAssignmentId resultassignmentid;
	@Column
	private int obtainedMarks;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="studentId",referencedColumnName="studentId", insertable=false,updatable=false)
	private StudentTable studenttable;
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="assignmentId",referencedColumnName="assignmentId", insertable=false,updatable=false)
	private Assignment assignment;
	
	public int getObtainedMarks() {
		return obtainedMarks;
	}

	public void setObtainedMarks(int obtainedMarks) {
		this.obtainedMarks = obtainedMarks;
	}

	public ResultAssignmentId getResultassignmentid() {
		return resultassignmentid;
	}

	public void setResultassignmentid(ResultAssignmentId resultassignmentid) {
		this.resultassignmentid = resultassignmentid;
	}
	public StudentTable getStudenttable() {
		return studenttable;
	}
	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}
	public Assignment getAssignment() {
		return assignment;
	}
	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}
	
	public ResultAssignment() {
		
	}
	public ResultAssignment(ResultAssignmentId resultassignmentid, int obtainedMarks) {
		this.resultassignmentid = resultassignmentid;
		this.obtainedMarks = obtainedMarks;
	}
}
