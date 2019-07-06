/**
 * 
 */
package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String emailID;
	@Column
	private String address;
	@Column
	private int branchId;
	@Column
	private String testLoginId;
	
	
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


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getBranchId() {
		return branchId;
	}
	
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getTestLoginId() {
		return testLoginId;
	}


	public void setTestLoginId(String testLoginId) {
		this.testLoginId = testLoginId;
	}


	public StudentTable() {
		// TODO Auto-generated constructor stub
	}

}
