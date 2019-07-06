package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch {
	@Id
    private int brachId;
	@Column
	private String name;
	public int getBrachId() {
		return brachId;
	}

	public void setBrachId(int brachId) {
		this.brachId = brachId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Branch() {
		// TODO Auto-generated constructor stub
	}

}
