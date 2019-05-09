package com.se.Test;

import org.junit.Test;

import com.se.dao.HomeworkDao;

public class HomeworkDaoTest {
	HomeworkDao hd = new HomeworkDao();

	@Test
	public void get() {
		System.out.println(hd.get(1));
	}
}
