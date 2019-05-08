package com.se.dao;

import org.hibernate.Session;

import com.se.pojo.Exp;
import com.se.util.HbmUtil;

public class ExpDao {
	public Exp get(int id) {
		Session session = HbmUtil.getSession();
		Exp exp = session.get(Exp.class, id);
		return exp;
	}
}
