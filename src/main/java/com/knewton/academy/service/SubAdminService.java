package com.knewton.academy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestParam;

import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.TestSeriesLogin;
import com.knewton.academy.model.Timetable;
import com.knewton.academy.model.BatchCourseMapping;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.StudentBatchMapping;
public interface SubAdminService {
	public Optional<StudentTable> showPersonalDetailOfSubAdmin(String id);
	public List<StudentTable> studentDisplay();
	public void studentAdd(StudentTable student);
	public void studentDelete(String id);
	public void studentEdit(StudentTable student);
	public void feesAdd(Fees fees);
	public void addtestId(TestSeriesLogin testserieslogin);
	public List<BatchCourseMapping> batchDisplay();
	public void addbatch(@RequestParam String studentId,@RequestParam String batchId);
	public void deletebatch(@RequestParam String studentId,@RequestParam String batchId);
	public void addtimetable(Timetable timetable);
//	public boolean deleteFees(String id);
//	public boolean updateFees(Fees fees,String id);
}


