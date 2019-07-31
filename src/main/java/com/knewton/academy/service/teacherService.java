package com.knewton.academy.service;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.TeacherBatchMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.Attendance;
import com.knewton.academy.model.AttendanceCountId;
import com.knewton.academy.model.AttendanceId;
import com.knewton.academy.model.ClassDelivered;

	
	public interface teacherService{
		public Optional<EmployeeTable> showPersonalDetailOfTeacher(String id);
		public List<Assignment> showAllAssignment();
		public void addAssignment(Assignment assignment);
		public void addResultAssignment(String studentId,int assignmentId,int obtainedMarks);
		public void addAttendance(Attendance attendance);		
		public List<StudentTable> studentDisplay();
		public List<TeacherBatchMapping> batchesDisplay();
		public void classdelivery(ClassDelivered classdelivered);
		public List<ClassDelivered> attendanceDisplay();
		public void  attendancesave(@RequestParam String studentId,@RequestParam int classDeliveredId,@RequestParam boolean attendance,@RequestParam String batchId);
	}
