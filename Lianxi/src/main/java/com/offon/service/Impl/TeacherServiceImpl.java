package com.offon.service.Impl;

import org.springframework.stereotype.Service;

import com.offon.mapper.CalssMapper;
import com.offon.mapper.TeacherMapper;
import com.offon.model.Calss;
import com.offon.model.Teacher;
import com.offon.service.TeacherService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* teacher
* @author ����
* @date 2019/09/20
*/
@Service
public class TeacherServiceImpl implements TeacherService {

	@Resource
	private TeacherMapper teacherMapper;
	
	@Resource
	private CalssMapper calssMapper;

	public Integer insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
	}


	public Integer delete(int id) {
		return   teacherMapper.delete(id);
	}


	public Integer update(Teacher teacher) {
		return teacherMapper.update(teacher);
	}


	@Override
	public List<Teacher> load(Integer n) {
		// TODO Auto-generated method stub
		return null;
	}


//	public List<Teacher> load(Integer n) {
//		List<Teacher> load = teacherMapper.load(n);
//		for (Teacher teacher : load) {
//			List<Calss> load2 = calssMapper.load(teacher.getTeacalss());
//			System.out.println(teacher.getTeacalss());
//			teacher.setCalssList(load2);
//		}
//		
//		return load;
//	}






}
