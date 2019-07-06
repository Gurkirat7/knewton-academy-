package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="result_assignment")
public class ResultAssignment {
	@Id
	@Column
	private String studentId;
	@Id
	@Column
	private int assignmentId;
	@Column
	private int obtainedMarks;
	
	@OneToOne
	@JoinColumn(name="studentId",referencedColumnName="studentId")
	private StudentTable studenttable;
	
	@OneToOne
	@JoinColumn(name="assignmentId",referencedColumnName="assignmentId")
	private Assignment assignment;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public int getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
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

	public Assignment getAssignment() {
		return assignment;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}
	
	public ResultAssignment() {
		
	}
}
