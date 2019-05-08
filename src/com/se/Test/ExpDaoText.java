package com.se.Test;

import org.junit.Test;

import com.se.dao.ExpDao;

public class ExpDaoText {
	@Test
	public void get() {
		ExpDao ed = new ExpDao();
		System.out.println(ed.get(1));
	}
}
