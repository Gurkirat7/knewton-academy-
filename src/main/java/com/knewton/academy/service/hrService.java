package com.knewton.academy.service;



import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.EmployeeTable;



public interface hrService {
	public  Optional<EmployeeTable> showPersonalDetailOfHR(String id);
	public  List<EmployeeTable> showAllEmployees();
	public   boolean addEmployee(EmployeeTable employee);
	public  boolean deleteEmployee(String id);
	public  boolean updateEmployee(EmployeeTable  employee);
}
