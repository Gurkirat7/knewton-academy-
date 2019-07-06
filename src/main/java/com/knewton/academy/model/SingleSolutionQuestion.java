package com.knewton.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="single_solution_question")
public class SingleSolutionQuestion {
	@Id
	@Column
	private int serialNo; 
	@Column
	private String question;
	@Column
	private String option1;
	@Column
	private String option2;
	@Column
	private String option3;
	@Column
	private String option4;
	@Column(name="class")
	private int CLASS;
	@Column
	private String subject;
	@Column
	private String topic;
	@Column
	private String subTopic;
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public int getCLASS() {
		return CLASS;
	}
	public void setCLASS(int class1) {
		CLASS = class1;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
	}
	
	public SingleSolutionQuestion() {
		
	}
	
}
