package com.kang.springdemo.model;

import java.util.Date;

public class Student {
	private int studentId;
	private String studentName, studentHobby;
	private Long studentMobile;
	private Date studentDOB;
	private String studentSkills;

	

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

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

	public Long getStudentMobile() {
		return studentMobile;
	}

	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}

	public Date getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}

	public String getStudentSkills() {
		return studentSkills;
	}

	public void setStudentSkills(String studentSkills) {
		this.studentSkills = studentSkills;
	}

}
