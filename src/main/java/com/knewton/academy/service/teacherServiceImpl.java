package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.Attendance;
import com.knewton.academy.model.AttendanceCount;
import com.knewton.academy.model.AttendanceCountId;
import com.knewton.academy.model.AttendanceId;
import com.knewton.academy.model.ClassDelivered;
import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.ResultAssignmentId;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.TeacherBatchMapping;
import com.knewton.academy.repository.AssignmentRepository;
import com.knewton.academy.repository.AttendanceCountRepository;
import com.knewton.academy.repository.AttendanceRepository;
import com.knewton.academy.repository.ClassDeliveredRepository;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.ResultAssignmentRepository;
import com.knewton.academy.repository.StudentTableRepository;
import com.knewton.academy.repository.TeacherBatchMappingRepository;

@Service
public class teacherServiceImpl implements teacherService{
    @Autowired
	EmployeeTableRepository employeeTableRepository;
    @Autowired
	AssignmentRepository assignmentRepository;
    @Autowired
   	ResultAssignmentRepository resultassignmentRepository;
    @Autowired
	AttendanceRepository attendanceRepository;
    @Autowired
    StudentTableRepository studenttablerepository;
    @Autowired
	TeacherBatchMappingRepository teacherbatchmappingrepository;
    @Autowired
    ClassDeliveredRepository classdeliveredrepository;
    @Autowired
    AttendanceCountRepository attendancecountrepository;

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
		Iterable<Assignment> assign= assignmentRepository.findAll();
		 ArrayList<Assignment> assigns = new ArrayList<Assignment>();
	       assign.forEach(e -> assigns.add(e));
	       return assigns;	
	}

	@Override
	public void addAssignment(Assignment assignment) {
    	assignmentRepository.save(assignment);
	}
	
	@Override
	public void addResultAssignment(String studentId,int assignmentId,int obtainedMarks)
	{
		ResultAssignment resultassignment = new ResultAssignment(new ResultAssignmentId(studentId,assignmentId),obtainedMarks);
		resultassignmentRepository.save(resultassignment);
	}

	@Override
	public void addAttendance(Attendance attendance) {
		attendanceRepository.save(attendance);
		
	}

	@Override
	public List<StudentTable> studentDisplay() {
		Iterable<StudentTable> student= studenttablerepository.findAll();
		 ArrayList<StudentTable> students = new ArrayList<StudentTable>();
	       student.forEach(e -> students.add(e));
	       return students;	
	}

	@Override
	public List<TeacherBatchMapping> batchesDisplay() {
		Iterable<TeacherBatchMapping> batch= teacherbatchmappingrepository.findAll();
		 ArrayList<TeacherBatchMapping> batches = new ArrayList<TeacherBatchMapping>();
	       batch.forEach(e -> batches.add(e));
	       return batches;
	}

	@Override
	public void classdelivery(ClassDelivered classdelivered) {
		classdeliveredrepository.save(classdelivered);
		
	}
	
	@Override
	public List<ClassDelivered> attendanceDisplay() {
		Iterable<ClassDelivered> student= classdeliveredrepository.findAll();
		 ArrayList<ClassDelivered> students = new ArrayList<ClassDelivered>();
	       student.forEach(e -> students.add(e));
	       return students;	
	}

	@Override
	public void attendancesave(String studentId, int classDeliveredId, boolean attendance, String batchId) {
		Attendance att = new Attendance(new AttendanceId(classDeliveredId,studentId));
		
		AttendanceCountId aid = new AttendanceCountId(studentId,batchId);
		Optional<AttendanceCount> count = attendancecountrepository.findById(aid);
		System.out.println(count);
		if(!count.isPresent())
		{
			AttendanceCount counts= new AttendanceCount(aid,1,0);
			counts.setTotalCount(1);
			if(attendance==true) {
			 counts.setPresentCount(1);}
			attendancecountrepository.save(counts);
			
		}
		else {
			
		AttendanceCount counts = count.get();
		if(attendanceRepository.findById(new AttendanceId(classDeliveredId,studentId)).isPresent())
		{
			counts.setTotalCount(counts.getTotalCount());
			Optional<Attendance> at1 = attendanceRepository.findById(new AttendanceId(classDeliveredId,studentId));
			Attendance at2 = at1.get();
			if(attendance==true && at2.isAttendance()==false ) 
			{
				counts.setPresentCount(counts.getPresentCount()+1);
			}
			if(attendance==false && at2.isAttendance()==true)
				{counts.setPresentCount(counts.getPresentCount()-1);}
			if(attendance==at2.isAttendance())
			{
				counts.setPresentCount(counts.getPresentCount());
			}
			
			attendancecountrepository.save(counts);
		}
		else {
    	counts.setTotalCount(counts.getTotalCount()+1);

		if(attendance) {
		counts.setPresentCount(counts.getPresentCount()+1);}
		att.setAttendance(attendance);
		
		}
		}
		att.setAttendance(attendance);
		attendanceRepository.save(att);
	}
}



	

