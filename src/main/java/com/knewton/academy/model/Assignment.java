package com.knewton.academy.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="assignment")
public class Assignment {
	@Id
	@Column
    private int assignmentId;
	@Column
	private String batchId;
	@Column
	private String description;
	@Column
	private int totalMarks;
	@Column
	private Date date;
	
	@OneToOne(mappedBy="assignment")
	private ResultAssignment resultassignment;
	
	@JsonIgnore
	@OneToOne
	@JoinColumn(name="batchId",referencedColumnName="batchId", insertable=false,updatable=false)
	private BatchCourseMapping batchcoursemapping;
	
	public int getAssignmentId() {
		return assignmentId;
	}

	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BatchCourseMapping getBatchcoursemapping() {
		return batchcoursemapping;
	}

	public void setBatchcoursemapping(BatchCourseMapping batchcoursemapping) {
		this.batchcoursemapping = batchcoursemapping;
	}

	public ResultAssignment getResultassignment() {
		return resultassignment;
	}

	public void setResultassignment(ResultAssignment resultassignment) {
		this.resultassignment = resultassignment;
	}

	public Assignment() {
		// TODO Auto-generated constructor stub
	}

}
