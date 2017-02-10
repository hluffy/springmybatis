package com.entity;

import java.io.Serializable;



public class StudentEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8076853623585530073L;
	private Integer studentId;
	private String studentName;
	private String classNum;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	

}