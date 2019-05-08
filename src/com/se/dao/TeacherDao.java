package com.se.dao;

import org.hibernate.Session;

import com.se.pojo.Teacher;
import com.se.util.HbmUtil;

public class TeacherDao {
	public Teacher get(int id) {
		Session session = HbmUtil.getSession();
		Teacher teacher = session.get(Teacher.class, id);
		HbmUtil.closeSession(session);
		return teacher;
	}
}
