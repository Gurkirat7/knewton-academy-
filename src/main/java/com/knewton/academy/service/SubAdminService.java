package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.Fees;
public interface SubAdminService {
	public Optional<StudentTable> showPersonalDetailOfSubAdmin(String id);
	public List<StudentTable> studentDisplay();
	public void studentAdd(StudentTable student);
	public void studentDelete(String id);
	public void studentEdit(StudentTable student);
//	public boolean addfees(Fees fees);
//	public boolean deleteFees(String id);
//	public boolean updateFees(Fees fees,String id);
}


