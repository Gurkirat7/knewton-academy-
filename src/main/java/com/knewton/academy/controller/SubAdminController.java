package com.knewton.academy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.FeesRepository;
import com.knewton.academy.repository.StudentTableRepository;
import com.knewton.academy.service.SubAdminServiceImp;

@RestController
public class SubAdminController {
	@Autowired
	StudentTableRepository studenttablerepository;
	@Autowired
	FeesRepository feesrepository;
	@Autowired
	EmployeeTableRepository employeetablerepository;
	@Autowired
	SubAdminServiceImp subadminserviceimp;
@GetMapping("/subadmin/info")
public Optional<StudentTable> showPersonalDetailOfSubAdmin(){
	return subadminserviceimp.showPersonalDetailOfSubAdmin("fsg");
}
@GetMapping("/subadmin/deletestudent")
public boolean deleteStudent() {
	StudentTable stu= new StudentTable();
	stu.getStudentId();
	subadminserviceimp.deleteStudent("stu");
	return true;
}
	@GetMapping("/subadmin/update")
	public boolean updateStudent() {
		StudentTable stu=new StudentTable();
		stu.getStudentId();
		subadminserviceimp.updateStudent(stu);
		return true;
			
}
	@GetMapping("/subadmin/list")
	public List<StudentTable> showAllStudent() {
		return subadminserviceimp.showAllStudent();
	}
	@GetMapping("/subadmin/add")
	public boolean addStudent() {
		StudentTable stu= new StudentTable();
		stu.setName("raam");
		stu.setEmailID("raamji");
		stu.setAddress("ghar hmara");
		stu.setContactDetails(986376376);
	    subadminserviceimp.addStudent(stu);
	    return true;
	}
	@GetMapping("/subadmin/addfees")
	public boolean addfees() {
		Fees fe=new Fees();
		fe.setTotalFees("100000");
		fe.setInstallment1("20000");
		fe.setInstallment2("10000");
		fe.setInstallment3("20000");
		subadminserviceimp.addfees(fe);
		return true;
	}
@GetMapping("/subadmin/deletefees")
public boolean deleteFees() {
	Fees fe= new Fees();
	fe.getStudentId();
	subadminserviceimp.deleteFees("fe");
	return true;
}
@GetMapping("/subadmin/updatefees")
public boolean updateFees() {
	Fees fe=new Fees();
	fe.getStudentId();
	subadminserviceimp.updateFees(fe, "gdh");
	return true;
}

}
