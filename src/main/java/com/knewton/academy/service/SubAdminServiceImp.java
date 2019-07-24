package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.EmployeeTable;
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
public void studentDelete(String studentId) {
	Optional<StudentTable> stu = studenttablerepository.findById(studentId);
	StudentTable stu1 = stu.get();
	stu1.setStatus(false);
	studenttablerepository.save(stu1);
}
@Override
public void studentEdit(StudentTable student) {
studenttablerepository.save(student);
}
@Override
public List<StudentTable> studentDisplay() {
	Iterable<StudentTable> student= studenttablerepository.findAll();
	 ArrayList<StudentTable> students = new ArrayList<StudentTable>();
       student.forEach(e -> students.add(e));
       return students;	
}

@Override
public void studentAdd(StudentTable student) {
	studenttablerepository.save(student);
}
//@Override
//public boolean addfees(Fees fees) {
//	feesrepository.save(fees);
//	return true;
//}
//@Override
//public boolean deleteFees(String id) {
//	feesrepository.deleteById(id);
//	return true;
//}
//
//@Override
//public boolean updateFees(Fees fees,String id) {
//	feesrepository.save(fees);
//return true;
//}

}