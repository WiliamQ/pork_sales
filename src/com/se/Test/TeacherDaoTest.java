package com.se.Test;

import org.junit.Test;

import com.se.dao.TeacherDao;

public class TeacherDaoTest {
	private TeacherDao td = new TeacherDao();

	@Test
	public void get() {
		System.out.println(td.get(1002));
	}
}
