package com.se.pojo;

import java.sql.Date;

public class Exp {
	private int exp_id;
	private String exp_address;
	private int teacher_id;
	private Date release_time;
	private Date deadline;

	public int getExp_id() {
		return exp_id;
	}

	public void setExp_id(int exp_id) {
		this.exp_id = exp_id;
	}

	public String getExp_address() {
		return exp_address;
	}

	public void setExp_address(String exp_address) {
		this.exp_address = exp_address;
	}

	public int getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}

	public Date getRelease_time() {
		return release_time;
	}

	public void setRelease_time(Date release_time) {
		this.release_time = release_time;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

}
