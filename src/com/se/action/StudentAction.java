package com.se.action;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.se.pojo.Student;
import com.se.service.StudentService;
import com.se.util.FileUtils;

@SuppressWarnings("serial")
public class StudentAction extends ActionSupport {
	private int id;
	private Student stu = new Student();
	private File avatar;
	private String avatarContentType; // 得到文件的类型
	private String avatarFileName; // 得到文件的名称

	public String add() {
		StudentService ss = new StudentService();
		if (avatar == null) {
			stu.setAvatar(ServletActionContext.getServletContext().getRealPath("/WEB-INF/StudentAvatar/default.jpg"));
		} else {
			// System.out.println(avatarFileName.trim());
			stu.setAvatar(ServletActionContext.getServletContext().getRealPath("/WEB-INF/StudentAvatar/") + stu.getId()
					+ "." + avatarFileName.trim().split("\\.")[1]);
		}
		FileUtils.copy(avatar, new File(stu.getAvatar()));
		// System.out.println(stu);
		ss.addStudent(stu);
		list();
		return ActionSupport.SUCCESS;
	}

	public String list() {
		StudentService ss = new StudentService();
		ActionContext.getContext().put("studentlist", ss.list());
		return ActionSupport.SUCCESS;
	}

	public String delete() {
		StudentService ss = new StudentService();
		ss.delete(id);
		list();
		return ActionSupport.SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public File getAvatar() {
		return avatar;
	}

	public void setAvatar(File avatar) {
		this.avatar = avatar;
	}

	public String getAvatarContentType() {
		return avatarContentType;
	}

	public void setAvatarContentType(String avatarContentType) {
		this.avatarContentType = avatarContentType;
	}

	public String getAvatarFileName() {
		return avatarFileName;
	}

	public void setAvatarFileName(String avatarFileName) {
		this.avatarFileName = avatarFileName;
	}

}
