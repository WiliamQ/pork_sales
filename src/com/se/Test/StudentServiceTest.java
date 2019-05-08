package com.se.Test;

import org.junit.Test;

import com.se.service.StudentService;

public class StudentServiceTest {
	public StudentService ss = new StudentService();

	@Test
	public void getExcel() {
		ss.getRoster();
	}
}
