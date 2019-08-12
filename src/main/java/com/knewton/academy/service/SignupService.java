package com.knewton.academy.service;

import java.util.List;

import com.knewton.academy.model.Signup;

public interface SignupService {
	public void Enterdetails(Signup signup);
    public List<Signup> ShowAllSignups();
}

