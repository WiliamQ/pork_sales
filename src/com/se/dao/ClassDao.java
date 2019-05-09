package com.se.dao;

import org.hibernate.Session;
import com.se.pojo.Class;
import com.se.util.HbmUtil;

public class ClassDao {
	public Class get(int id) {
		Session session = HbmUtil.getSession();
		Class c = session.get(Class.class, id);
		HbmUtil.closeSession(session);
		return c;
	}
}
