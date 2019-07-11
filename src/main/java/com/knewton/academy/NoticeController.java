package com.knewton.academy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.knewton.academy.service.NoticeServiceImpl;
import com.knewton.academy.model.Notice;

@RestController
public class NoticeController {
	@Autowired
	private NoticeServiceImpl noticeserviceimpl;
	@GetMapping("/notice")
	 public List<Notice> allNotice() {

        return noticeserviceimpl.getNotice();
    }
	@GetMapping("/no")
	public void addnotice() {
		noticeserviceimpl.addnotice();
		System.out.println("aaa");
	}

}
