package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Result;
import com.service.ScoreService;

@Controller
public class ScoreController {
	
	@Resource
	private ScoreService scoreService;
	
	@RequestMapping("/getscore.ll")
	@ResponseBody
	public Result getScore(){
		Result result = new Result();
		result = scoreService.getScore(20161131);
		return result;
	}

}
