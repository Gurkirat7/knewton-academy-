/**
 * 
 */
package com.knewton.academy.model;

import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name="studenttable")
public class StudentTable {
	@Id
	@Column
	private String studentId;
	@Column
    private String name;
	@Column(name="class")
	private int stuclass;
	@Column
	private String fatherName;
	@Column
	private String motherName;
	@Column
	private int contactDetails;
	@Column
	private String emailId;
	@Column
	private String address;
	@Column
	private String branchId;
	@Column
	private boolean status = true;
	@OneToMany(mappedBy="studenttable")
	private Set<Attendance> attendance;
	@OneToMany(mappedBy="studenttable")
	private Set<AttendanceCount> attendancecount; 
	@OneToOne(mappedBy="studenttable")
	private Fees fees;
	@OneToOne(mappedBy="studenttable")
	private ResultTest resulttest;
	@OneToMany(mappedBy="studenttable")
	private Set<ResultAssignment> resultassignment;
	@OneToMany(mappedBy="studenttable")
	private Set<StudentBatchMapping> studentbatchmapping;
	@OneToOne(mappedBy="studenttable")
	private TestSeriesLogin testserieslogin;
	@ManyToOne
	@JoinColumn(name="branchId", referencedColumnName="branchId", insertable=false,updatable=false)
	private Branch branch;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStuclass() {
		return stuclass;
	}


	public void setStuclass(int stuclass) {
		this.stuclass = stuclass;
	}


	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public int getContactDetails() {
		return contactDetails;
	}

    public void setContactDetails(int contactDetails) {
		this.contactDetails = contactDetails;
	}


	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	
	public Set<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(Set<Attendance> attendance) {
		this.attendance = attendance;
	}


	public Set<AttendanceCount> getAttendancecount() {
		return attendancecount;
	}

	public void setAttendancecount(Set<AttendanceCount> attendancecount) {
		this.attendancecount = attendancecount;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}

	public ResultTest getResulttest() {
		return resulttest;
	}

	public void setResulttest(ResultTest resulttest) {
		this.resulttest = resulttest;
	}
	
	public Set<ResultAssignment> getResultassignment() {
		return resultassignment;
	}

	public void setResultassignment(Set<ResultAssignment> resultassignment) {
		this.resultassignment = resultassignment;
	}

	public Set<StudentBatchMapping> getStudentbatchmapping() {
		return studentbatchmapping;
	}

	public void setStudentbatchmapping(Set<StudentBatchMapping> studentbatchmapping) {
		this.studentbatchmapping = studentbatchmapping;
	}

	public boolean isStatus() {
		return status;
	}

	
	public TestSeriesLogin getTestserieslogin() {
		return testserieslogin;
	}

	public void setTestserieslogin(TestSeriesLogin testserieslogin) {
		this.testserieslogin = testserieslogin;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public StudentTable() {
		// TODO Auto-generated constructor stub
	}

}
