package com.knewton.academy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Notice;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.StudentTableRepository;
import com.knewton.academy.service.adminServiceImpl;

@RestController
public class AdminController {
	
	@Autowired
	adminServiceImpl adminserviceimpl;
	
	@GetMapping("/admin/student")
	 public List<StudentTable> studentDisplay() {
		List<StudentTable> stu = adminserviceimpl.studentDisplay();
       return stu;
   }
	
	@GetMapping("/admin/employee")
	 public List<EmployeeTable> employeeDisplay() {
		List<EmployeeTable> emp = adminserviceimpl.employeeDisplay();
     return emp;
 }
	@GetMapping("/admin/employee/{id}")
	public Optional<EmployeeTable> employeeFind(@PathVariable String id)
	{
		return adminserviceimpl.employeefind(id);
	}
	
	@RequestMapping(value="/employee/add",method=RequestMethod.POST)
	public RedirectView employeeAdd(EmployeeTable employee) {
		System.out.println("Before emplye");
		adminserviceimpl.employeeAdd(employee);
		System.out.println("aaa");
		return new RedirectView("/Employee_Table.html");
	}
	@RequestMapping(value="/employee/edit",method=RequestMethod.POST)
	public RedirectView editEmp(EmployeeTable employee) {
		System.out.println("Before emplye++++++++++++++");
		adminserviceimpl.employeeEdit(employee);
		System.out.println("++++++++++++++++++++Before emplye");
		return new RedirectView("/Employee_Table.html");
	}
	}