package com.knewton.academy.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacherbatchmapping")
public class TeacherBatchMapping {
	
	@EmbeddedId
	private TeacherBatchMappingId teacherbatchmappingid;
	
	@OneToOne
	@JoinColumn(name="employeeId", referencedColumnName="employeeId",insertable=false, updatable=false)
	private EmployeeTable employeetable;
	
	@OneToOne
	@JoinColumn(name="batchId", referencedColumnName="batchId",insertable=false, updatable=false)
	private BatchCourseMapping batchcoursemapping;

	
	public TeacherBatchMappingId getTeacherbatchmappingid() {
		return teacherbatchmappingid;
	}
	public void setTeacherbatchmappingid(TeacherBatchMappingId teacherbatchmappingid) {
		this.teacherbatchmappingid = teacherbatchmappingid;
	}
	
	public EmployeeTable getEmployeetable() {
		return employeetable;
	}


	public void setEmployeetable(EmployeeTable employeetable) {
		this.employeetable = employeetable;
	}


	public BatchCourseMapping getBatchcoursemapping() {
		return batchcoursemapping;
	}


	public void setBatchcoursemapping(BatchCourseMapping batchcoursemapping) {
		this.batchcoursemapping = batchcoursemapping;
	}

	public TeacherBatchMapping() {
		
	}
	public TeacherBatchMapping(TeacherBatchMappingId teacherbatchmappingid) {
		this.teacherbatchmappingid = teacherbatchmappingid;
	}
}
