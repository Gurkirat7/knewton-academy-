package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="timetable")
public class Timetable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String batchId;
	@Column
	private String day;
	@Column
	private String time;
	@Column
	private String room;
	@JsonIgnore
	 @ManyToOne
		@JoinColumn(name="batchId", referencedColumnName="batchId", insertable=false,updatable=false)
		private BatchCourseMapping batchcoursemapping;
	 
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getBatchId() {
		return batchId;
	}



	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}



	public String getDay() {
		return day;
	}



	public void setDay(String day) {
		this.day = day;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getRoom() {
		return room;
	}



	public void setRoom(String room) {
		this.room = room;
	}



	public BatchCourseMapping getBatchcoursemapping() {
		return batchcoursemapping;
	}



	public void setBatchcoursemapping(BatchCourseMapping batchcoursemapping) {
		this.batchcoursemapping = batchcoursemapping;
	}



	public Timetable() {
		// TODO Auto-generated constructor stub
	}

}
