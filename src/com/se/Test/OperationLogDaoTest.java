package com.se.Test;

import org.junit.Test;

import com.se.dao.OperationLogDao;

public class OperationLogDaoTest {
	OperationLogDao old = new OperationLogDao();

	@Test
	public void get() {
		System.out.println(old.get(1));
	}
}
