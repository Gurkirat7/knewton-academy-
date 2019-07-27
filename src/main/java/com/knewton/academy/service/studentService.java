package com.knewton.academy.service;

import java.util.Optional;

import com.knewton.academy.model.AttendanceCount;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.ResultTest;
import com.knewton.academy.model.StudentTable;

public interface studentService {
	public  Optional<StudentTable> showPersonalDetailOfStudent(String id);
//	public Optional <ResultAssignment> resultassignment(String id);
	public  ResultTest resulttest(String id);
	public  AttendanceCount attendance(String id);
}
