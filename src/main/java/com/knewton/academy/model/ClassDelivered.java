package com.knewton.academy.model;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="classdelivered")
public class ClassDelivered {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int classDeliveredId;
	@Column 
	private String batchId;
    @Column
    private Date date;
    
    
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


	public ClassDelivered() {
		// TODO Auto-generated constructor stub
	}

}
