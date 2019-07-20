package com.knewton.academy.service;

import com.knewton.academy.model.EmployeeTable;
import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.Attendance;

	
	public interface teacherService{
		public Optional<EmployeeTable> showPersonalDetailOfTeacher(String id);
		public List<Assignment> showAllAssignment();
		public void addAssignmentMarks(Assignment assignment);
		public void addAttendance(Attendance attendance);		
		
	}
