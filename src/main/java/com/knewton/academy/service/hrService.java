package com.knewton.academy.service;



import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.EmployeeTable;



public interface hrService {
	public Optional<EmployeeTable> showPersonalDetailOfHR(String id);
	public List<EmployeeTable> employeeDisplay();
	public void employeeAdd(EmployeeTable employee);
	public void employeeDelete(String employeeId);
	public void employeeEdit(EmployeeTable  employee);
}
