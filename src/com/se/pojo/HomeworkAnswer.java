package com.se.pojo;

import java.util.Date;

public class HomeworkAnswer {
	private int id;
	private int studentId;
	private String studentName;
	private Date submitTime;
	private String address;
	private Integer score = 0;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "HomeworkAnswer [id=" + id + ", studentId=" + studentId + ", studentName=" + studentName
				+ ", submitTime=" + submitTime + ", score=" + score + "]";
	}

}
