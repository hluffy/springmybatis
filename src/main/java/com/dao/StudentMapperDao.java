package com.dao;

import java.util.List;

import com.entity.StudentEntity;

public interface StudentMapperDao {
	public StudentEntity getStudent(int studentId);
	public List<StudentEntity> getStudents();

}