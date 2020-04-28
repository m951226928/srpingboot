package com.offon.service.Impl;

import org.springframework.stereotype.Service;

import com.offon.mapper.CalssMapper;
import com.offon.mapper.TeacherMapper;
import com.offon.model.Calss;
import com.offon.service.CalssService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* calss
* @author ����
* @date 2019/09/20
*/
@Service
public class CalssServiceImpl implements CalssService {

	@Resource
	private CalssMapper calssMapper;
	
	@Resource
	private TeacherMapper  teacherMapper;



	public Integer insert(Calss calss) {

        return calssMapper.insert(calss);
	}



	public Integer delete(int id) {
		return calssMapper.delete(id);
	}



	public Integer update(Calss calss) {
		return calssMapper.update(calss);
	}



	public List<Calss> load() {
		
		
		
		return calssMapper.load();
	}

	public List<Calss> load1(Integer n) {
		
		
		
		return calssMapper.load1(n);
	}

	
	

}
