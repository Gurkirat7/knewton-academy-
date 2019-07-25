package com.knewton.academy.service;


import java.util.ArrayList;
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
	EmployeeTableRepository employeetablerepository;
	
 
	@Override
	public Optional<EmployeeTable> showPersonalDetailOfHR(String id) {
		Optional<EmployeeTable> employee= employeetablerepository.findById(id);
		return employee;
	}

	@Override
	public List<EmployeeTable> employeeDisplay() {
		Iterable<EmployeeTable> employee= employeetablerepository.findAll();
		 ArrayList<EmployeeTable> employees = new ArrayList<EmployeeTable>();
	      employee.forEach(e -> employees.add(e));
	      return employees;
	}
	
	@Override
	public void employeeEdit(EmployeeTable employee) {
		employeetablerepository.save(employee);
	}

	@Override
	public void employeeDelete(String employeeId) {
//		employeetablerepository.deleteById(employeeId);
		Optional<EmployeeTable> emp = employeetablerepository.findById(employeeId);
		EmployeeTable emp1 = emp.get();
		emp1.setStatus(false);
		employeetablerepository.save(emp1);
	}

	@Override
	public void employeeAdd(EmployeeTable employee) {		
		employeetablerepository.save(employee);		
	}
	
	}



