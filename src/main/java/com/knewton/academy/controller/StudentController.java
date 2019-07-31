package com.knewton.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knewton.academy.model.ClassDelivered;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.StudentBatchMapping;
import com.knewton.academy.service.studentServiceImp;

@RestController
public class StudentController {

	@Autowired
	studentServiceImp studentserviceimp;
	@GetMapping("/student/batch")
	public List<StudentBatchMapping> batchesDisplay() {
		List<StudentBatchMapping> batch = studentserviceimp.batchesDisplay();
	  return batch;
	}
	@GetMapping("/student/attendance")
	public List<ClassDelivered> attendance() {
		List<ClassDelivered> batch = studentserviceimp.attendance();
	  return batch;
	}
	@GetMapping("/student/ass")
	public List<ResultAssignment> showass() {
		List<ResultAssignment> ass = studentserviceimp.showass();
	  return ass;
	}
	@GetMapping("/student/fee")
	public List<Fees> showfee() {
		List<Fees> ass = studentserviceimp.showfee();
	  return ass;
	}
}
