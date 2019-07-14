package com.knewton.academy.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.knewton.academy.model.Notice;
import com.knewton.academy.repository.NoticeRepository;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeRepository noticeRepository;
	

	@Override
	public void addnotice(String title,String content){
		Notice notice = new Notice();
		Calendar calendar = Calendar.getInstance();
		notice.setTitle(title);
		notice.setContent(content);
		notice.setDate(new java.sql.Date(calendar.getTime().getTime()));
		noticeRepository.save(notice);
//		Notice noticeNew = new Notice();
//		noticeNew = (Notice) noticeRepository.findOne(notice.getTitle());
//		System.out.println(noticeNew);
//		System.out.println("idk");
	}
	
	@Override
	public List<Notice> getNotice() {
		Iterable<Notice> it= noticeRepository.findAll();
	 ArrayList<Notice> users = new ArrayList<Notice>();
        it.forEach(e -> users.add(e));
        return users;
	}
}
