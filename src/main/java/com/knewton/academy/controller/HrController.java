	
	package com.knewton.academy.controller;

	import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.knewton.academy.service.hrServiceImp;
import com.knewton.academy.model.EmployeeTable;

	@RestController
	public class HrController {
		
		@Autowired
		hrServiceImp hrserviceimp;
//		@Autowired
//		EmployeeTable employeetable;
		
				
		@GetMapping("/hrinfo")
		 public List<EmployeeTable> allHrs() {

	        return hrserviceimp.showAllEmployees();
	    }
		@GetMapping("/hrprofile")
		public Optional<EmployeeTable> shd() {
		
			return hrserviceimp.showPersonalDetailOfHR("fgt");
	
		}
		@GetMapping("/hrprofile/add")
		public boolean addEmployee() {
			EmployeeTable emp= new EmployeeTable();
			emp.setName("raam");
			emp.setEmailId("raamji");
			emp.setAddress("ghar hmara");
			emp.setContactDetails(986376376);
		    hrserviceimp.addEmployee(emp);
		    return true;
		}
		@GetMapping("/hrprofile/delete")
		public boolean deleteEmployee() {
			EmployeeTable emp= new EmployeeTable();
			emp.getEmployeeId();
			hrserviceimp.deleteEmployee("emp");
			return true;
		}
		@GetMapping("/hrprofile/update")
		public boolean updateEmployee() {
			EmployeeTable emp=new EmployeeTable();
			emp.getEmployeeId();
			hrserviceimp.updateEmployee(emp);
			return true;
			
		}
			
		
		
		}
	
