package com.knewton.academy.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.knewton.academy.service.NoticeServiceImpl;
import com.knewton.academy.model.Notice;

@RestController
public class NoticeController {
	@Autowired
	private NoticeServiceImpl noticeserviceimpl;
	private JSONConverter jsonconverter;
	
	@GetMapping("/notice")
	 public List<Notice> allNotice() {
		List<Notice> not = noticeserviceimpl.getNotice();
//		List<JSONObject> jsonObjList= jsonconverter.getNoticeList(not);
        return not;
    }
	
	@RequestMapping(value="/no",method=RequestMethod.POST)
	public RedirectView addnotice(@RequestParam String title, @RequestParam String content) {
		noticeserviceimpl.addnotice(title,content);
		System.out.println("aaa");
		return new RedirectView("/admin");
	}

}
