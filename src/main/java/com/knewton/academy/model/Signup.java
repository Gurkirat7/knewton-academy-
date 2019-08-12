package com.knewton.academy.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="signup")
public class Signup {
	@Id
	private int sno;
	@Column
	private String name;
	@Column
	private String emailID;
	@Column
	private String password;
	@Column
	private BigInteger contactDetails;
	@Column(name="class")
	private int CLASS;
	@Column
	private String course;
	@Column
	private String parentsName;
	@Column
	private String address;
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public BigInteger getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(BigInteger contactDetails) {
		this.contactDetails = contactDetails;
	}
	public int getCLASS() {
		return CLASS;
	}
	public void setCLASS(int cLASS) {
		CLASS = cLASS;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getParentsName() {
		return parentsName;
	}
	public void setParentsName(String parentsName) {
		this.parentsName = parentsName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Signup() {
		
	}
}
