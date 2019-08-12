package com.knewton.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.knewton.academy.service.NoticeServiceImpl;

@Controller
public class AppController {
	
	@Autowired
	NoticeServiceImpl noticeserviceimpl;
	 @GetMapping("/signup")
	    public String signup() {
	        return "signup";
	    }
	 @GetMapping("/thanks")
	    public String thanks() {
	        return "thanks";
	    }
	 @GetMapping("/admin")
	    public String admin() {
	        return "AdminPortal/admin";
	    }
	 @GetMapping("/SignUp_Table.html")
	    public String SignUp_Table() {
	        return "AdminPortal/SignUp_Table";
	    }
	 @GetMapping("/Student_Table.html")
	    public String Student_Table() {
	        return "AdminPortal/Student_Table";
	    }
	 @GetMapping("/Employee_Table.html")
	    public String Employee_Table() {
	        return "AdminPortal/Employee_Table";
	    }
	 @GetMapping("/Login_Table.html")
	    public String Login_Table() {
	        return "AdminPortal/Login_Table";
	    }
	 @GetMapping("/subadmin")
	    public String subadmin() {
	        return "SubAdminPortal/Sub_Admin";
	    }
	 @GetMapping("/parent")
	    public String parent() {
	        return "ParentPortal/parentportal_index";
	    }
	 @GetMapping("/parentportal_attendance.html")
	    public String parentportal_attendance() {
	        return "ParentPortal/parentportal_attendance";
	    }
	 @GetMapping("/parentportal_perf.html")
	    public String parentportal_perf() {
	        return "ParentPortal/parentportal_perf";
	    }
	 @GetMapping("/teacher")
	    public String teacher() {
	        return "TeacherPortal/teacherportal";
	 }
	 @GetMapping("/attendance.html")
	    public String attendance() {
	        return "TeacherPortal/attendance";
	 }
	 @GetMapping("/assignmentMarks.html")
	    public String assignment() {
	        return "TeacherPortal/assignmentMarks";
	 }
	 @GetMapping("/hr")
	    public String hr() {
	        return "HrPortal/hr";
	 }
//	 @RestController
//	 public class Notice{
//		 @Autowired
//		 private NoticeRepository noticeRepository;
//		 @GetMapping("/notice")
//		 public Iterable<com.knewton.academy.model.Notice> retrieveNotice(){
//			 return noticeRepository.findAll();
//		 }
//	 }
	 
//	@RequestMapping(value="/notice",method=RequestMethod.GET)
//	public class NoticeController{
//		@Autowired
//		private NoticeServiceImpl noticeserviceimpl;
//		noticeserviceimpl.getNotice();
//	}
	
//	@ResponseBody
//	public List<Notice> getNotice() {
//		NoticeServiceImpl noticeserviceimpl = new NoticeServiceImpl();
//		List<Notice> noticeList = (List<Notice>)noticeserviceimpl.getNotice();
//		return noticeList;
//	}
	 
//	
//	void NoticeController(){
//		NoticeServiceImpl noticeserviceimpl = new NoticeServiceImpl();
//		List<Notice> noticeList = (List<Notice>)noticeserviceimpl.getNotice();
//		System.out.println(noticeList);
//	}
//
}

