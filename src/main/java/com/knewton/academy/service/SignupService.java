package com.knewton.academy.service;

import java.util.List;

import com.knewton.academy.model.Signup;

public interface SignupService {
//	public void Enterdetails(String name,String emailID,String password,int contactDetails,int clas,String course, String parentsName,String address);
    public List<Signup> ShowAllSignups();
}

