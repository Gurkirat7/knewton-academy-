package com.knewton.academy.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.Notice;
import com.knewton.academy.repository.NoticeRepository;

@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	NoticeRepository noticeRepository;
	

	@Override
	public void addnotice() {
		Notice notice = new Notice();
		Calendar calendar = Calendar.getInstance();
		notice.setTitle("Good Morning");
		notice.setDate(new java.sql.Date(calendar.getTime().getTime()));
		noticeRepository.save(notice);
		Notice noticeNew = new Notice();
		noticeNew = (Notice) noticeRepository.findOne(notice.getTitle());
		System.out.println(noticeNew);
	}
	
}
