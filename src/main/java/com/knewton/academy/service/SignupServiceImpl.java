package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.Notice;
import com.knewton.academy.model.Signup;
import com.knewton.academy.repository.SignupRepository;

@Service
public class SignupServiceImpl implements SignupService {
@Autowired
SignupRepository signupRepository;

@Override
public void Enterdetails(Signup signup) {
		signupRepository.save(signup);
		
   }
@Override
public List<Signup> ShowAllSignups() {
	Iterable<Signup> it= signupRepository.findAll();
	 ArrayList<Signup> users = new ArrayList<Signup>();
       it.forEach(e -> users.add(e));
       return users;
}


}
