package com.knewton.academy.service;

import java.util.List;

import com.knewton.academy.model.Notice;

//import org.springframework.stereotype.Service;

public interface NoticeService {
	public List<Notice> getNotice();
	public void addnotice(String title,String content);
}
