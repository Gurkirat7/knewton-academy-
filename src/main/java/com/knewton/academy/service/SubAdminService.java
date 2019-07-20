package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.Fees;
public interface SubAdminService {
	public Optional<StudentTable> showPersonalDetailOfSubAdmin(String id);
	public List<StudentTable> showAllStudent();
	public boolean addStudent(StudentTable student);
	public boolean deleteStudent(String id);
	public boolean updateStudent(StudentTable student);
	public boolean addfees(Fees fees);
	public boolean deleteFees(String id);
	public boolean updateFees(Fees fees,String id);
}


