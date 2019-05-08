package com.se.dao;

import java.util.LinkedList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.se.pojo.Student;
import com.se.util.HbmUtil;

public class StudentDao {

	public Student get(int id) {
		Session session = HbmUtil.getSession();
		String hql = "FROM Student WHERE id=?1";
		Query<Student> query = session.createQuery(hql, Student.class);
		query.setParameter(1, id);
		Student stu = query.uniqueResult();
		HbmUtil.closeSession(session);
		return stu;
	}

	public void add(Student stu) {
		Session session = HbmUtil.getSession();
		session.save(stu);
		HbmUtil.closeSession(session);
	}

	public void delete(int id) {
		Session session = HbmUtil.getSession();
		Student stu = new Student();
		stu.setId(id);
		session.delete(stu);
		HbmUtil.closeSession(session);
	}

	public List<Student> list() {
		List<Student> ansList = new LinkedList<Student>();
		Session session = HbmUtil.getSession();
		String hql = "FROM Student";
		Query query = session.createQuery(hql, Student.class);
		ansList = query.list();
		HbmUtil.closeSession(session);
		return ansList;
	}
}
