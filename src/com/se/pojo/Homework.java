package com.se.pojo;

import java.util.Date;

public class Homework {
	private int id;
	private int teacherId;
	private String address;
	private Date releaseTime;
	private Date deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "Homework [id=" + id + ", teacherId=" + teacherId + ", address=" + address + ", releaseTime="
				+ releaseTime + ", deadline=" + deadline + "]";
	}
}
