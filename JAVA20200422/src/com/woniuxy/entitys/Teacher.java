package com.woniuxy.entitys;

public class Teacher {

	private String teacherName;
	private String teacherCourse;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}

	public Teacher(String teacherName, String teacherCourse) {
		super();
		this.teacherName = teacherName;
		this.teacherCourse = teacherCourse;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherCourse() {
		return teacherCourse;
	}

	public void setTeacherCourse(String teacherCourse) {
		this.teacherCourse = teacherCourse;
	}

	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", teacherCourse=" + teacherCourse + "]";
	}
	
	
	
}
