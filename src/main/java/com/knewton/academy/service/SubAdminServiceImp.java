package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.Fees;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.FeesRepository;
import com.knewton.academy.repository.StudentTableRepository;

@Service
public class SubAdminServiceImp implements SubAdminService {
@Autowired
StudentTableRepository studenttablerepository;
@Autowired
FeesRepository feesrepository;
@Autowired
EmployeeTableRepository employeetablerepository;
@Override
public Optional<StudentTable> showPersonalDetailOfSubAdmin(String id) {
	Optional<StudentTable> student=studenttablerepository.findById(id);
		return student;
}
@Override
public boolean deleteStudent(String id) {
	studenttablerepository.deleteById(id);
	return true;
}
@Override
public boolean updateStudent(StudentTable student) {
studenttablerepository.save(student);
return true;
}
@Override
public List<StudentTable> showAllStudent() {
List<StudentTable>studentlist=(List<StudentTable>) studenttablerepository.findAll();
return studentlist;
}
@Override
public boolean addStudent(StudentTable student) {
	studenttablerepository.save(student);
	return true;
}
@Override
public boolean addfees(Fees fees) {
	feesrepository.save(fees);
	return true;
}
@Override
public boolean deleteFees(String id) {
	feesrepository.deleteById(id);
	return true;
}

@Override
public boolean updateFees(Fees fees,String id) {
	feesrepository.save(fees);
return true;
}
}