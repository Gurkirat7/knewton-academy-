package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Login;
import com.knewton.academy.model.Signup;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.LoginRepository;
import com.knewton.academy.repository.SignupRepository;
import com.knewton.academy.repository.StudentTableRepository;

@Service
public class adminServiceImpl implements adminService{
 @Autowired
 EmployeeTableRepository employeetablerepository;
 @Autowired
 SignupRepository signuprepository;
 @Autowired
 StudentTableRepository studenttablerepository;
 @Autowired
 LoginRepository loginrepository;


@Override
public List<StudentTable> studentDisplay() {
	Iterable<StudentTable> student= studenttablerepository.findAll();
	 ArrayList<StudentTable> students = new ArrayList<StudentTable>();
       student.forEach(e -> students.add(e));
       return students;	
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
//	employeetablerepository.deleteById(employeeId);
	Optional<EmployeeTable> emp = employeetablerepository.findById(employeeId);
	EmployeeTable emp1 = emp.get();
	emp1.setStatus(false);
	employeetablerepository.save(emp1);
}

@Override
public void employeeAdd(EmployeeTable employee) {	
	employeetablerepository.save(employee);	
}

@Override
public List<Signup> signupDisplay() {
	Iterable<Signup> signup= signuprepository.findAll();
	 ArrayList<Signup> signups = new ArrayList<Signup>();
     signup.forEach(e -> signups.add(e));

     return signups;
	
}

@Override
public List<Login> loginDisplay() {
	Iterable<Login> login= loginrepository.findAll();
	 ArrayList<Login> logins = new ArrayList<Login>();
    login.forEach(e -> logins.add(e));

    return logins;
	
}

@Override
public Optional<EmployeeTable> employeefind(String id) {
	
	return employeetablerepository.findById(id);
}
}
