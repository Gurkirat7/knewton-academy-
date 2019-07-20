package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.Attendance;
import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.repository.AssignmentRepository;
import com.knewton.academy.repository.AttendanceRepository;
import com.knewton.academy.repository.EmployeeTableRepository;

@Service
public class teacherServiceImpl implements teacherService{

	EmployeeTableRepository employeeTableRepository;
	AssignmentRepository assignmentRepository;
	AttendanceRepository attendanceRepository;
//	public void teacherServiceImpl() {
//		return null;
//	}

	@Override
	public Optional<EmployeeTable> showPersonalDetailOfTeacher(String id) {
		Optional<EmployeeTable> employee = employeeTableRepository.findById(id); 	
		return employee;
	}

	@Override
	public List<Assignment> showAllAssignment() {
		List<Assignment> assignmentList=(List<Assignment>) assignmentRepository.findAll();
		return assignmentList;
	}

	@Override
	public void addAssignmentMarks(Assignment assignment) {
    	assignmentRepository.save(assignment);
	}

	@Override
	public void addAttendance(Attendance attendance) {
		attendanceRepository.save(attendance);
		
	}

}
