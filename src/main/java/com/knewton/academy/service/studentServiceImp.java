package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.Assignment;
import com.knewton.academy.model.ClassDelivered;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.StudentBatchMapping;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.repository.AssignmentRepository;
import com.knewton.academy.repository.ClassDeliveredRepository;
import com.knewton.academy.repository.FeesRepository;
import com.knewton.academy.repository.ResultAssignmentRepository;
import com.knewton.academy.repository.StudentBatchMappingRepository;
import com.knewton.academy.repository.StudentTableRepository;

@Service
public class studentServiceImp implements studentService {
@Autowired
  StudentTableRepository studenttablerepository;
@Autowired
  ResultAssignmentRepository resultassignmentrepository;
  @Autowired
  StudentBatchMappingRepository studentbatchmappingrepository;
  @Autowired 
  ClassDeliveredRepository classdeliveredrepository;
  @Autowired
  FeesRepository feesrepository;
	@Override
	public Optional<StudentTable> showPersonalDetailOfStudent(String id) {
		Optional<StudentTable> student=studenttablerepository.findById(id);
		
		return student;
	}

//	@Override
//	public Optional<ResultAssignment> resultassignment(String id) {
//	Optional<ResultAssignment> result= 	resultassignmentrepository.findById(id);
//	   return result ;
//	}


	@Override
	public List<ClassDelivered> attendance() {
		Iterable<ClassDelivered> batch= classdeliveredrepository.findAll();
		 ArrayList<ClassDelivered> batches = new ArrayList<ClassDelivered>();
	       batch.forEach(e -> batches.add(e));
	       return batches;
	}
	
	@Override
	public List<StudentBatchMapping> batchesDisplay() {
		Iterable<StudentBatchMapping> batch= studentbatchmappingrepository.findAll();
		 ArrayList<StudentBatchMapping> batches = new ArrayList<StudentBatchMapping>();
	       batch.forEach(e -> batches.add(e));
	       return batches;
	}

	@Override
	public List<ResultAssignment> showass() {
		Iterable<ResultAssignment> ass= resultassignmentrepository.findAll();
		 ArrayList<ResultAssignment> asses = new ArrayList<ResultAssignment>();
	       ass.forEach(e -> asses.add(e));
	       return asses;
	}

	@Override
	public List<Fees> showfee() {
		Iterable<Fees> batch= feesrepository.findAll();
		 ArrayList<Fees> batches = new ArrayList<Fees>();
	       batch.forEach(e -> batches.add(e));
	       return batches;
	}

}
