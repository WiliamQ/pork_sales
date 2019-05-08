package com.se.pojo;

import java.util.Date;

public class Exp {
	private int id;
	private String address;
	private int teacherId;
	private Date releaseTime;
	private Date deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public Date getReleaseTime() {
		return releaseTime;
	}

	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Exp [id=" + id + ", address=" + address + ", teacherId=" + teacherId + ", releaseTime=" + releaseTime
				+ ", deadline=" + deadline + "]";
	}

}
