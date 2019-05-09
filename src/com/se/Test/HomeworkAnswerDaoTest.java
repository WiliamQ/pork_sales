package com.se.Test;

import org.junit.Test;

import com.se.dao.HomeworkAnswerDao;

public class HomeworkAnswerDaoTest {
	HomeworkAnswerDao had = new HomeworkAnswerDao();

	@Test
	public void get() {
		int id = 1;
		System.out.println(had.get(id));
	}
}
