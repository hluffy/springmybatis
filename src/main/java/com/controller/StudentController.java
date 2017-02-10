package com.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Result;
import com.service.StudentService;

@Controller
public class StudentController {
	@Resource
	private StudentService studentService;
	
	@RequestMapping("/studentinfo.ll")
	@ResponseBody
	public Result getStudent(){
		Result result = new Result();
		result = studentService.getStudent(20161129);
		return result;
	}

}