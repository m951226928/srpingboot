package com.offon.service;

import java.util.List;
import java.util.Map;

import com.offon.model.Teacher;

/**
* teacher
* @author ����
* @date 2019/09/20
*/
public interface TeacherService {

    /**
    * ����
    */
    public Integer insert(Teacher teacher);

    /**
    * ɾ��
    */
    public Integer delete(int id);

    /**
    * ����
    */
    public Integer update(Teacher teacher);

    /**
    * �������I id ��ԃ
     * @param n 
    */
    public List<Teacher> load(Integer n);

  


}
