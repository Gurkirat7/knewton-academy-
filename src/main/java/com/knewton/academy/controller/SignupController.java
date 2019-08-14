package com.knewton.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Signup;
import com.knewton.academy.service.SignupServiceImpl;

@RestController
public class SignupController {
	@Autowired
	private SignupServiceImpl signupserviceimpl;
	
	@GetMapping("/sign")
	 public List<Signup> ShowAllSignups(){
		List<Signup> sup = signupserviceimpl.ShowAllSignups();
       return sup;
   }
	
	@RequestMapping(value="/signup/data",method=RequestMethod.POST)
	public RedirectView editEmp(Signup signup) {
		signupserviceimpl.Enterdetails(signup);
		return new RedirectView("/thanks");
		}
	@RequestMapping(value="/signup/delete",method=RequestMethod.POST)
	public RedirectView delsignup(@RequestParam int sno) {
		signupserviceimpl.delsignup(sno);
		return new RedirectView("/thanks");
		}
}
