package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.AttendanceId;
import com.knewton.academy.model.BatchCourseMapping;
import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.ResultAssignment;
import com.knewton.academy.model.ResultAssignmentId;
import com.knewton.academy.model.StudentBatchMapping;
import com.knewton.academy.model.StudentBatchMappingId;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.TestSeriesLogin;
import com.knewton.academy.model.Timetable;
import com.knewton.academy.repository.BatchCourseMappingRepository;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.FeesRepository;
import com.knewton.academy.repository.StudentBatchMappingRepository;
import com.knewton.academy.repository.StudentTableRepository;
import com.knewton.academy.repository.TestSeriesLoginRepository;
import com.knewton.academy.repository.TimetableRepository;

@Service
public class SubAdminServiceImp implements SubAdminService {
@Autowired
StudentTableRepository studenttablerepository;
@Autowired
FeesRepository feesrepository;
@Autowired
StudentBatchMappingRepository studentbatchmappingrepository;
@Autowired
EmployeeTableRepository employeetablerepository;
@Autowired
TestSeriesLoginRepository testseriesloginrepository;
@Autowired
BatchCourseMappingRepository batchcoursemappingrepository;
@Autowired
TimetableRepository timetablerepository;
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
@Override
public void feesAdd(Fees fees) {
	feesrepository.save(fees);
	
}
@Override
public void addtestId(TestSeriesLogin testserieslogin) {
	
	testseriesloginrepository.save(testserieslogin);
	
}
@Override
public List<BatchCourseMapping> batchDisplay() {
	Iterable<BatchCourseMapping> student= batchcoursemappingrepository.findAll();
	 ArrayList<BatchCourseMapping> students = new ArrayList<BatchCourseMapping>();
      student.forEach(e -> students.add(e));
      return students;	
}
@Override
public void addbatch(String studentId,String batchId) {
	// TODO Auto-generated method stub
	StudentBatchMapping studentbatchmapping = new StudentBatchMapping(new StudentBatchMappingId(studentId,batchId));
	studentbatchmappingrepository.save(studentbatchmapping);
}
@Override
public void deletebatch(String studentId, String batchId) {
	StudentBatchMapping studentbatchmapping = new StudentBatchMapping(new  StudentBatchMappingId(studentId,batchId));
	studentbatchmappingrepository.deleteById(studentbatchmapping.getStudentbatchmappingid());
}
@Override
public void addtimetable(Timetable timetable) {
	timetablerepository.save(timetable);
}

}