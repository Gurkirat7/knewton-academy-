package com.knewton.academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.knewton.academy.model.Assignment;


@Service
public class AssignmentServiceImpl implements AssignmentService {
	@Autowired
	private AssignmentRepository assignmentRepository;
	
	
}
