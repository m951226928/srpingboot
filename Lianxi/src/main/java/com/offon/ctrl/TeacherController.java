package com.offon.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.offon.model.Teacher;
import com.offon.service.TeacherService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
* teacher
* @author ����
* @date 2019/09/20
*/
@RestController
@RequestMapping(value = "/Teacher")
public class TeacherController {

    @Resource
    private TeacherService teacherService;

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/insert")
    public Integer insert(Teacher teacher){
        return teacherService.insert(teacher);
    }

    /**
    * [�h��]
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/delete")
    public Integer delete(int id){
        return teacherService.delete(id);
    }

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/update")
    public Integer update(Teacher teacher){
        return teacherService.update(teacher);
    }

    /**
    * [��ԃ] �������I id ��ԃ
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/load")
    public List<Teacher> load(){
    	Integer n = 1;
    	List<Teacher> load = teacherService.load(n);
 
        return load;
    }

    @RequestMapping("/load1")
    public List<Teacher> load1(){
    	Integer n = 1;
    	List<Teacher> load = teacherService.load(n);
    	for (Teacher teacher : load) {
			System.out.println(teacher.getCalssList());
		}
        return teacherService.load(n);
    }
}

