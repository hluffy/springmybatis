package com.serviceImp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.StudentMapperDao;
import com.entity.Result;
import com.entity.StudentEntity;
import com.service.StudentService;

@Service
public class StudentServiceImp implements StudentService{
	
	@Resource
	private StudentMapperDao smDao;

	public Result getStudent(int studentId) {
		Result result = new Result();
		StudentEntity student = smDao.getStudent(studentId);
		result.setData(student);
		result.setStatus(0);
		result.setMsg("操作成功");
		return result;
	}

	public Result getStudents() {
		Result result = new Result();
		List<StudentEntity> infos = new ArrayList<StudentEntity>();
		infos = smDao.getStudents();
		result.setData(infos);
		result.setStatus(0);
		result.setMsg("操作成功");;
		return result;
	}


}