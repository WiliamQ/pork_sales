package com.se.Test;

import org.junit.Test;
import com.se.pojo.Class;
import com.se.dao.ClassDao;

public class ClassDaoTest {
	static ClassDao cd = new ClassDao();

	@Test
	public static void get() {
		Class c = cd.get(1);
		System.out.println(c);
	}

	public static void main(String[] args) {
		get();
	}
}