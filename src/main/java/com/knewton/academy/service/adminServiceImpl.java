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

//@Override
//public List<StudentTable> studentSearch(String course,String stuclass) {
//	
//	Iterable<StudentTable> student= studenttablerepository.findByCourseOrClass(course,stuclass);
//	 ArrayList<StudentTable> students = new ArrayList<StudentTable>();
//      student.forEach(e -> students.add(e));
//      return students;
//	
//}

@Override
public List<StudentTable> studentDisplay() {
	Iterable<StudentTable> student= studenttablerepository.findAll();
	 ArrayList<StudentTable> students = new ArrayList<StudentTable>();
       student.forEach(e -> students.add(e));

       return students;
	
}

//@Override
//public List<EmployeeTable> employeeSearch(int typeid) {
//	Iterable<EmployeeTable> employee= employeetablerepository.findByTypeId(typeid);
//	 ArrayList<EmployeeTable> employees = new ArrayList<EmployeeTable>();
//     employee.forEach(e -> employees.add(e));
//
//     return employees;
//}

@Override
public List<EmployeeTable> employeeDisplay() {
	Iterable<EmployeeTable> employee= employeetablerepository.findAll();
	 ArrayList<EmployeeTable> employees = new ArrayList<EmployeeTable>();
      employee.forEach(e -> employees.add(e));

      return employees;
	
}

@Override
public void employeeEdit(String id,EmployeeTable employee) {
	Optional<EmployeeTable> employees = employeetablerepository.findById(id);
	employeetablerepository.save(employee);
}

@Override
public void employeeDelete(String id) {
	employeetablerepository.deleteById(id);
	
}

@Override
public void employeeAdd(String employeeId, String name, int userTypeId,int contactDetails, String emailId,String address,int salary ) {
	System.out.println("befire seps';'da");
	EmployeeTable emp = new EmployeeTable();
	emp.setEmployeeId(employeeId);
	emp.setAddress(address);
	emp.setContactDetails(contactDetails);
	emp.setEmailId(emailId);
	emp.setName(name);
	emp.setSalary(salary);
	emp.setUserTypeId(userTypeId);
	employeetablerepository.save(emp);
	System.out.println(name);
	
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

//@Override
//public List<Login> loginSearch(int typeid) {
//	Iterable<Login> login= loginrepository.findByTypeId(typeid);
//	 ArrayList<Login> logins = new ArrayList<Login>();
//   login.forEach(e -> logins.add(e));
//
//   return logins;
//	
//}
}
