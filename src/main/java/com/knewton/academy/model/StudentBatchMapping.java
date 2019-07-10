package com.knewton.academy.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="studentbatchmapping")
public class StudentBatchMapping {
	
	@EmbeddedId
	private StudentBatchMappingId studentbatchmappingid;
	
	@OneToOne
	@JoinColumn(name="studentId", referencedColumnName="studentId", insertable=false,updatable=false)
	private StudentTable studenttable;
	
	@OneToOne
	@JoinColumn(name="batchId", referencedColumnName="batchId", insertable=false,updatable=false)
	private BatchCourseMapping batchcoursemapping;
	
	
	public StudentBatchMappingId getStudentbatchmappingid() {
		return studentbatchmappingid;
	}

	public void setStudentbatchmappingid(StudentBatchMappingId studentbatchmappingid) {
		this.studentbatchmappingid = studentbatchmappingid;
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

	public StudentBatchMapping() {
		
	}
	
	public StudentBatchMapping(StudentBatchMappingId studentbatchmappingid) {
		this.studentbatchmappingid = studentbatchmappingid;
	}
}
