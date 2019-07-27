package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="batchcoursemapping")
public class BatchCourseMapping {
	@Id
	private String batchId;
	@Column
	private String batchName;
	@Column
	private int courseId;
	@OneToOne(mappedBy="batchcoursemapping")
	private AttendanceCount attendancecount;
	@OneToOne(mappedBy="batchcoursemapping")
	private ClassDelivered classdelivered;
//	@OneToOne(mappedBy="batchcoursemapping")
//	private StudentBatchMapping studentbatchmapping;
	@OneToOne(mappedBy="batchcoursemapping")
	private TeacherBatchMapping teacherbatchmapping;
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="courseId", referencedColumnName="courseId", insertable=false,updatable=false)
	private Course course;
	
	
	public String getBatchId() {
		return batchId;
	}


	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	

	public String getBatchName() {
		return batchName;
	}


	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}


	public int getCourseId() {
		return courseId;
	}


	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}

	public AttendanceCount getAttendancecount() {
		return attendancecount;
	}


	public void setAttendancecount(AttendanceCount attendancecount) {
		this.attendancecount = attendancecount;
	}


	public ClassDelivered getClassdelivered() {
		return classdelivered;
	}


	public void setClassdelivered(ClassDelivered classdelivered) {
		this.classdelivered = classdelivered;
	}


//	public StudentBatchMapping getStudentbatchmapping() {
//		return studentbatchmapping;
//	}
//
//
//	public void setStudentbatchmapping(StudentBatchMapping studentbatchmapping) {
//		this.studentbatchmapping = studentbatchmapping;
//	}


	public TeacherBatchMapping getTeacherbatchmapping() {
		return teacherbatchmapping;
	}


	public void setTeacherbatchmapping(TeacherBatchMapping teacherbatchmapping) {
		this.teacherbatchmapping = teacherbatchmapping;
	}


	public BatchCourseMapping() {
		// TODO Auto-generated constructor stub
	}

}
