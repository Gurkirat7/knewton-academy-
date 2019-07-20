package com.knewton.academy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.ClassDelivered;
import com.knewton.academy.model.Attendance;
import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.service.teacherServiceImpl;

@RestController
public class TeacherController {
	@Autowired
	teacherServiceImpl teacherserviceimpl;
//	@Autowired
//	EmployeeTable employeetable;
	@GetMapping("/teacherinfo")
	public Optional<EmployeeTable> teacher() {
		return teacherserviceimpl.showPersonalDetailOfTeacher("fgt");
	}
	@GetMapping("/teacherinfo/assignmentmarks")
	public List<Assignment> showAllAssignment(){
		 return teacherserviceimpl.showAllAssignment();
	}
@GetMapping("/teacherinfo/addmarks")	
public boolean addAssignmentMarks() {
	Assignment am= new Assignment();
	am.setTotalMarks(102);
	return true;
	}	
@GetMapping("/teacherinfo/addattandance")
public boolean addAttendance() {
	ClassDelivered cd= new ClassDelivered();
		cd.setClassDeliveredId(51);
return true;
}

}

