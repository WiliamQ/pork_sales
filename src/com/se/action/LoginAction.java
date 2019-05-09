package com.se.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.se.service.StudentService;
import com.se.service.TeacherService;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	private Integer id;
	private String password;

	@Override
	public String execute() throws Exception {
		System.out.println(id + "," + password);
		ActionContext.getContext().put("loginerror", "账号或密码错误");
		StudentService ss = new StudentService();

		if (ss.login(id, password)) {
			ActionContext.getContext().getSession().put("USER", id);
			ActionContext.getContext().getSession().put("ROLE", "Student");
			return "StudentLoginSuccess";
		} else {
			TeacherService ts = new TeacherService();
			if (ts.login(id, password)) {
				ActionContext.getContext().getSession().put("USER", id);
				ActionContext.getContext().getSession().put("ROLE", "Teacher");
				return "TeacherLoginSuccess";
			}
		}
		System.out.println("Done");
		return "fail";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
