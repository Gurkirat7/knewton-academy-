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

//@Override
//public void Enterdetails(String name, String emailID, String password, int contactDetails, int clas, String course,
//			String parentsName, String address) {
//		Signup signup = new Signup();
//		signup.setAddress(address);
//		signup.setCLASS(clas);
//		signup.setContactDetails(contactDetails);
//		signup.setCourse(course);
//		signup.setEmailID(emailID);
//		signup.setName(parentsName);
//		signup.setParentsName(parentsName);
//		signup.setPassword(password);	
//		signupRepository.save(signup);
//		
//   }
@Override
public List<Signup> ShowAllSignups() {
	Iterable<Signup> it= signupRepository.findAll();
	 ArrayList<Signup> users = new ArrayList<Signup>();
       it.forEach(e -> users.add(e));
       return users;
}


}
