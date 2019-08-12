package com.knewton.academy.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="employeetable")
public class EmployeeTable {

	@Id
	@Column
    private String employeeId;
	@Column
	private String name;
	@Column
	private int userTypeId;
	@Column
	private BigInteger contactDetails;
	@Column
	private String emailId;
	@Column
	private String address;
	@Column
	private int salary;
	@Column
	private int branchId;
	@Column
	private boolean status = true;
	@ManyToOne
	@JoinColumn(name="userTypeId", referencedColumnName="userTypeId", insertable=false,updatable=false)
	private Usertype usertype;
	@ManyToOne
	@JoinColumn(name="branchId", referencedColumnName="branchId", insertable=false,updatable=false)
	private Branch branch;
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	public int getUserTypeId() {
		return userTypeId;
	}


	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}


	


	public BigInteger getContactDetails() {
		return contactDetails;
	}


	public void setContactDetails(BigInteger contactDetails) {
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getBranchId() {
		return branchId;
	}


	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	public Usertype getUsertype() {
		return usertype;
	}


	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}

	
	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public EmployeeTable() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "EmployeeTable [employeeId=" + employeeId + ", name=" + name + ", userTypeId=" + userTypeId
				+ ", contactDetails=" + contactDetails + ", emailId=" + emailId + ", address=" + address + ", salary="
				+ salary + ", status=" + status +  ", usertype="
				+ usertype + "]";
	}
	

}
