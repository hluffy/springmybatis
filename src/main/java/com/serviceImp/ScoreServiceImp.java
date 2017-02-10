package com.serviceImp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.ScoreMapperDao;
import com.entity.Result;
import com.entity.ScoreEntity;
import com.service.ScoreService;

@Service
public class ScoreServiceImp implements ScoreService{
	
	@Resource
	private ScoreMapperDao smDao;

	public Result getScore(Integer studentId) {
		Result result = new Result();
		ScoreEntity score = new ScoreEntity();
		score = smDao.getScore(studentId);
		result.setData(score);
		result.setStatus(0);
		result.setMsg("�����ɹ�");
		return result;
	}

}
