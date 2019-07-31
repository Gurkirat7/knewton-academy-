package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.ClassDelivered;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.StudentBatchMapping;
import com.knewton.academy.model.StudentTable;

public interface studentService {
	public  Optional<StudentTable> showPersonalDetailOfStudent(String id);
	public  List<ClassDelivered> attendance();
	public List<StudentBatchMapping> batchesDisplay();
	public List<ResultAssignment> showass();
	public List<Fees> showfee();
}
