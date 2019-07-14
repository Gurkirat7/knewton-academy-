package com.knewton.academy.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.knewton.academy.model.Notice;
@Service
public class JSONConverter {
	public static JSONObject getNotice(Notice notice) {
		JSONObject json = new JSONObject();
		try {
			json.put("Title",notice.getTitle());
			json.put("SerialNo",notice.getSerialNo());
			json.put("Content",notice.getContent());
			json.put("Date",notice.getDate());
		}catch(JSONException e) {
			e.printStackTrace();
		}
		return json;
	}
	public List<JSONObject> getNoticeList(List<Notice> not) {
		List<JSONObject> list=new ArrayList<JSONObject>();
			not.forEach(e -> list.add(getNotice(e))); 
		return list;
	}
}
