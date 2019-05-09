package com.se.dao;

import org.hibernate.Session;

import com.se.pojo.Homework;
import com.se.util.HbmUtil;

public class HomeworkAnswerDao {
	public Homework get(int id) {
		Session session = HbmUtil.getSession();
		Homework hw = session.get(Homework.class, id);
		HbmUtil.closeSession(session);
		return hw;
	}
}
