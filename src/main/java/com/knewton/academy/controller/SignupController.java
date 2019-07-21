package com.knewton.academy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
}
