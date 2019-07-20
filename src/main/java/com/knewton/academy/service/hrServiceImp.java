package com.knewton.academy.service;


import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.repository.EmployeeTableRepository;


@Service
public class hrServiceImp implements hrService {
	//public final Logger LOGGER=  Logger.getLogger (hrServiceImp.class);
	
	@Autowired
	EmployeeTableRepository employeeTableRepository;
	
 
	@Override
	public boolean deleteEmployee(String id) {
		
		 employeeTableRepository.deleteById(id);
		 return true;
	}
 
	@Override
	public boolean updateEmployee(EmployeeTable employee) {
	   employeeTableRepository.save(employee);
		return true;
	}

	@Override
	public Optional<EmployeeTable> showPersonalDetailOfHR(String id) {
		Optional<EmployeeTable> employee= employeeTableRepository.findById(id);
		return employee;
	}

	@Override
	public List<EmployeeTable> showAllEmployees() {
		List<EmployeeTable> employeeList= (List<EmployeeTable>) employeeTableRepository.findAll();
		System.out.println(employeeList);
		return employeeList;
	}

	@Override
	public boolean  addEmployee(EmployeeTable employee) {
		employeeTableRepository.save(employee);
		return true;
	}

	
	}



