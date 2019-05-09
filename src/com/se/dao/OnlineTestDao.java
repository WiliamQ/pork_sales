package com.se.dao;

import org.hibernate.Session;
import com.se.pojo.OnlineTest;
import com.se.util.HbmUtil;

public class OnlineTestDao {
	public OnlineTest get(int id) {
		Session session = HbmUtil.getSession();
		OnlineTest ot = session.get(OnlineTest.class, id);
		HbmUtil.closeSession(session);
		return ot;
	}
}
