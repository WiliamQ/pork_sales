package com.se.pojo;

public class OperationLog {
	private int id;
	private int studentId;
	private String studentName;
	private String operation;

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

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	@Override
	public String toString() {
		return "OperationLog [id=" + id + ", studentId=" + studentId + ", studentName=" + studentName + ", operation="
				+ operation + "]";
	}

}
