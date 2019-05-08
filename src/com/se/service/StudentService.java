package com.se.service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.se.dao.StudentDao;
import com.se.pojo.Student;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class StudentService {
	public boolean login(int id, String password) {
		StudentDao dao = new StudentDao();
		Student stu = dao.get(id);
		System.out.println(id + " " + password);
		if (stu != null && stu.getPassword().equals(password))
			return true;
		return false;
	}

	public void addStudent(Student stu) {
		StudentDao dao = new StudentDao();
		dao.add(stu);
	}

	public List<Student> list() {
		StudentDao dao = new StudentDao();
		return dao.list();
	}

	public void delete(int id) {
		StudentDao sd = new StudentDao();
		sd.delete(id);
	}

	public boolean getRoster() {
		StudentDao dao = new StudentDao();
		List<Student> list = dao.list();
		WritableWorkbook book;
		try {
			System.out.println("---start---");
			// 打开文件
			book = Workbook.createWorkbook(new File("/WEB-INF/roster/Roster.xls"));

			// 生成名为“第一页”的工作表，参数0表示这是第一页
			WritableSheet sheet = book.createSheet("sheet_one", 0);

			// 在Label对象的构造中指名单元格位置是第一列第一行(0,0)
			// 以及单元格内容为Hello World
			Label label0 = new Label(0, 0, "学号");
			Label label1 = new Label(1, 0, "姓名");
			Label label2 = new Label(2, 0, "签名");
			// 将定义好的单元格添加到工作表中
			sheet.addCell(label0);
			sheet.addCell(label1);
			sheet.addCell(label2);
			int count = 1;
			for (Student stu : list) {
				label0 = new Label(0, count, stu.getId() + "");
				label1 = new Label(1, count++, stu.getName());
				sheet.addCell(label0);
				sheet.addCell(label1);
			}

			// 写入数据并关闭文
			book.write();
			book.close();

		} catch (IOException | WriteException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
