package com.se.Test;

import org.junit.jupiter.api.Test;

import com.se.dao.StudentDao;
import com.se.pojo.Student;

public class StudentDaoTest {
	@Test
	public void add() {
		StudentDao sd = new StudentDao();
		Student stu = new Student();
		stu.setPassword("123456");
		stu.setName("林鹏飞");
		stu.setAvatar("/StudentAvatar");
		stu.setClassId(2);
		stu.setId(221600224);
		sd.add(stu);
	}

	@Test
	public void delete() {
		StudentDao sd = new StudentDao();
		sd.delete(221600113);
	}

	@Test
	public void get() {
		StudentDao sd = new StudentDao();
		System.out.println(sd.get(221600224));
	}

	public static void main(String[] args) {
		StudentDaoTest sdt = new StudentDaoTest();
		sdt.add();
	}
}
