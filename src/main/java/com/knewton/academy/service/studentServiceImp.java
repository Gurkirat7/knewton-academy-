package com.knewton.academy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.AttendanceCount;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.ResultTest;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.repository.ResultAssignmentRepository;
import com.knewton.academy.repository.StudentTableRepository;

@Service
public class studentServiceImp implements studentService {
@Autowired
  StudentTableRepository studenttablerepository;
  ResultAssignmentRepository resultassignmentrepository;
	@Override
	public Optional<StudentTable> showPersonalDetailOfStudent(String id) {
		Optional<StudentTable> student=studenttablerepository.findById(id);
		
		return student;
	}

	@Override
	public Optional<ResultAssignment> resultassignment(String id) {
	Optional<ResultAssignment> result= 	resultassignmentrepository.findById(id);
	   return result ;
	}

	@Override
	public ResultTest resulttest(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AttendanceCount attendance(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
