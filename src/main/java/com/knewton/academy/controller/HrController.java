package com.knewton.academy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.knewton.academy.service.hrServiceImp;
import com.knewton.academy.model.EmployeeTable;

	@RestController
	public class HrController {
		
		@Autowired
		hrServiceImp hrserviceimp;
		
		@GetMapping("/hrprofile")
		public Optional<EmployeeTable> shd() {
		
			return hrserviceimp.showPersonalDetailOfHR("fgt");
	
		}
		@GetMapping("/hr/employee")
		 public List<EmployeeTable> employeeDisplay() {
			List<EmployeeTable> emp = hrserviceimp.employeeDisplay();
	     return emp;
	 }
		@RequestMapping(value="/hr/add",method=RequestMethod.POST)
		public RedirectView employeeAdd(EmployeeTable employee) {
			System.out.println("Before emplye");
			hrserviceimp.employeeAdd(employee);
			System.out.println("aaa");
			return new RedirectView("/hr");
		}
		@RequestMapping(value="/hr/edit",method=RequestMethod.POST)
		public RedirectView editEmp(EmployeeTable employee) {
			hrserviceimp.employeeEdit(employee);
			return new RedirectView("/hr");
		}
		@RequestMapping(value="/hr/delete",method=RequestMethod.POST)
		public RedirectView deleteEmp(@RequestParam String employeeId) {
			hrserviceimp.employeeDelete(employeeId);
			return new RedirectView("/hr");
		}
		}
	
