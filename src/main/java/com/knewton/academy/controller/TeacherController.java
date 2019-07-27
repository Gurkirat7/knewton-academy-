package com.knewton.academy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.ClassDelivered;
import com.knewton.academy.model.Attendance;
import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.TeacherBatchMapping;
import com.knewton.academy.model.TestSeriesLogin;
import com.knewton.academy.service.teacherServiceImpl;

@RestController
public class TeacherController {
	@Autowired
	teacherServiceImpl teacherserviceimpl;
//	@Autowired
//	EmployeeTable employeetable;
//	@GetMapping("/teacherinfo")
//	public Optional<EmployeeTable> teacher() {
//		return teacherserviceimpl.showPersonalDetailOfTeacher("fgt");
////	}
	@GetMapping("/teacher/assignment")
	public List<Assignment> showAllAssignment(){
		 return teacherserviceimpl.showAllAssignment();
	}
//@GetMapping("/teacherinfo/addmarks")	
//public boolean addAssignmentMarks() {
//	Assignment am= new Assignment();
//	am.setTotalMarks(102);
//	return true;
//	}	
//@GetMapping("/teacherinfo/addattandance")
//public boolean addAttendance() {
//	ClassDelivered cd= new ClassDelivered();
//		cd.setClassDeliveredId(51);
//return true;
//}

@GetMapping("/teacher/student")
public List<StudentTable> studentDisplay() {
	List<StudentTable> stu = teacherserviceimpl.studentDisplay();
  return stu;
}

@RequestMapping(value="/teacher/assign",method=RequestMethod.POST)
public RedirectView assignmentAdd(Assignment assignment) {
	teacherserviceimpl.addAssignment(assignment);
//	teacherserviceimpl.addResultAssignment(resultassignment);
	return new RedirectView("/assignmentMarks.html");
}

@RequestMapping(value="/teacher/assignedit",method=RequestMethod.POST)
public RedirectView assignmentEdit(@RequestParam String studentId,@RequestParam int assignmentId,@RequestParam int obtainedMarks) {
	teacherserviceimpl.addResultAssignment(studentId,assignmentId,obtainedMarks);
	return new RedirectView("/assignmentMarks.html");
}

@GetMapping("/teacher/batch")
public List<TeacherBatchMapping> batchesDisplay() {
	List<TeacherBatchMapping> batch = teacherserviceimpl.batchesDisplay();
  return batch;
}


}

