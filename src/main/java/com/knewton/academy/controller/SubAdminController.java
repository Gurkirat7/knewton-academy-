package com.knewton.academy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.knewton.academy.model.BatchCourseMapping;
import com.knewton.academy.model.EmployeeTable;
import com.knewton.academy.model.Fees;
import com.knewton.academy.model.StudentBatchMapping;
import com.knewton.academy.model.StudentTable;
import com.knewton.academy.model.TestSeriesLogin;
import com.knewton.academy.model.Timetable;
import com.knewton.academy.repository.EmployeeTableRepository;
import com.knewton.academy.repository.FeesRepository;
import com.knewton.academy.repository.StudentTableRepository;
import com.knewton.academy.repository.TestSeriesLoginRepository;
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

@RequestMapping(value="/subadmin/add",method=RequestMethod.POST)
public RedirectView studentAdd(StudentTable student,Fees fees,TestSeriesLogin testserieslogin) {
	subadminserviceimp.studentAdd(student);
	subadminserviceimp.feesAdd(fees);
	subadminserviceimp.addtestId(testserieslogin);
	return new RedirectView("/subadmin");
}

@RequestMapping(value="/subadmin/addbatch",method=RequestMethod.POST)
public RedirectView studentAdd(@RequestParam String studentId,@RequestParam String batchId) {
	subadminserviceimp.addbatch(studentId,batchId);
	return new RedirectView("/subadmin");
}
@RequestMapping(value="/subadmin/deletebatch",method=RequestMethod.POST)
public RedirectView deleteBatch(@RequestParam String studentId,@RequestParam String batchId) {
	subadminserviceimp.deletebatch(studentId,batchId);
	return new RedirectView("/subadmin");
}
@RequestMapping(value="/subadmin/edit",method=RequestMethod.POST)
public RedirectView editStu(StudentTable student,Fees fees,TestSeriesLogin testserieslogin) {
	subadminserviceimp.studentEdit(student);
	subadminserviceimp.feesAdd(fees);
	subadminserviceimp.addtestId(testserieslogin);	
	return new RedirectView("/subadmin");
}

@RequestMapping(value="/subadmin/delete",method=RequestMethod.POST)
public RedirectView deleteStu(@RequestParam String studentId) {
	subadminserviceimp.studentDelete(studentId);
	return new RedirectView("/subadmin");
}

	@GetMapping("/subadmin/student")
	 public List<StudentTable> studentDisplay() {
		List<StudentTable> stu = subadminserviceimp.studentDisplay();
      return stu;
  }
	
	@GetMapping("/subadmin/batchcourse")
	 public List<BatchCourseMapping> batchDisplay() {
		List<BatchCourseMapping> stu = subadminserviceimp.batchDisplay();
     return stu;
 }
	@GetMapping("/subadmin/timetableshow")
	 public List<Timetable> ttdisplay() {
		List<Timetable> tt = subadminserviceimp.ttdisplay();
    return tt;
}
	@RequestMapping(value="/subadmin/timetabledelete",method=RequestMethod.POST)
	public RedirectView ttdelete(@RequestParam int sno) {
		subadminserviceimp.ttdelete(sno);
		return new RedirectView("/subadmin");
	}
	@RequestMapping(value="/subadmin/timetable",method=RequestMethod.POST)
	public RedirectView addtimetable(Timetable timetable) {
		subadminserviceimp.addtimetable(timetable);
		return new RedirectView("/subadmin");
	}
//	@GetMapping("/subadmin/addfees")
//	public boolean addfees() {
//		Fees fe=new Fees();
//		fe.setTotalFees("100000");
//		fe.setInstallment1("20000");
//		fe.setInstallment2("10000");
//		fe.setInstallment3("20000");
//		subadminserviceimp.addfees(fe);
//		return true;
//	}
//@GetMapping("/subadmin/deletefees")
//public boolean deleteFees() {
//	Fees fe= new Fees();
//	fe.getStudentId();
//	subadminserviceimp.deleteFees("fe");
//	return true;
//}
//@GetMapping("/subadmin/updatefees")
//public boolean updateFees() {
//	Fees fe=new Fees();
//	fe.getStudentId();
//	subadminserviceimp.updateFees(fe, "gdh");
//	return true;
//}

}
