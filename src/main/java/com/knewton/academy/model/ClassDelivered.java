package com.knewton.academy.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="classdelivered")
public class ClassDelivered {
	@Id
    private int classDeliveredId;
	@Column 
	private String batchId;
    @Column
    private Date date;
    
    @OneToMany(mappedBy="classdelivered")
    private Set<Attendance> attendance;
    @JsonIgnore
    @ManyToOne
	@JoinColumn(name="batchId", referencedColumnName="batchId", insertable=false,updatable=false)
	private BatchCourseMapping batchcoursemapping;
    
	public int getClassDeliveredId() {
		return classDeliveredId;
	}
	
	public void setClassDeliveredId(int classDeliveredId) {
		this.classDeliveredId = classDeliveredId;
	}
	public String getBatchId() {
		return batchId;
	}
	public void setBatchId(String batchId) {
		this.batchId = batchId;
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
	
	public Set<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(Set<Attendance> attendance) {
		this.attendance = attendance;
	}

	public ClassDelivered() {
		// TODO Auto-generated constructor stub
	}

}
