package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Login;
import com.knewton.academy.model.Signup;
import com.knewton.academy.model.StudentTable;

public interface adminService {
	
//	public List<StudentTable> studentSearch(String course,String stuclass);
    public List<StudentTable> studentDisplay();
//    public List<EmployeeTable> employeeSearch(int typeid);
    public List<EmployeeTable> employeeDisplay();
    public void employeeEdit(EmployeeTable employee);
    public void employeeDelete(String id);
    public void employeeAdd(EmployeeTable employee);
    public List<Signup> signupDisplay();
    public List<Login> loginDisplay();
    public Optional<EmployeeTable> employeefind(String id);
//    public List<Login> loginSearch(int typeid);
}
