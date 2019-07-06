package com.knewton.academy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {
	 @GetMapping("/signup")
	    public String signup() {
	        return "signup";
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
}
