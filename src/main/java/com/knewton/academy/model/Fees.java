package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="fees")
public class Fees {
	@Id
	@Column
    private String studentId;
	@Column
	private String totalFees;
	@Column
	private String installment1;
	@Column
	private int installment2;
	@Column
	private String installment3;
	
	@OneToOne
	@JoinColumn(name="studentId", referencedColumnName="studentId", insertable=false,updatable=false)
	private StudentTable studenttable;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getTotalFees() {
		return totalFees;
	}

	public void setTotalFees(String totalFees) {
		this.totalFees = totalFees;
	}

	public String getInstallment1() {
		return installment1;
	}

	public void setInstallment1(String installment1) {
		this.installment1 = installment1;
	}

	public int getInstallment2() {
		return installment2;
	}

	public void setInstallment2(int installment2) {
		this.installment2 = installment2;
	}

	

	public String getInstallment3() {
		return installment3;
	}

	public void setInstallment3(String installment3) {
		this.installment3 = installment3;
	}

	public StudentTable getStudenttable() {
		return studenttable;
	}

	public void setStudenttable(StudentTable studenttable) {
		this.studenttable = studenttable;
	}

	public Fees() {
		// TODO Auto-generated constructor stub
	}

}
