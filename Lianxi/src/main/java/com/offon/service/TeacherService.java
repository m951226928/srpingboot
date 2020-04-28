package com.offon.service;

import java.util.List;
import java.util.Map;

import com.offon.model.Teacher;

/**
* teacher
* @author 张瑞博
* @date 2019/09/20
*/
public interface TeacherService {

    /**
    * 新增
    */
    public Integer insert(Teacher teacher);

    /**
    * 删除
    */
    public Integer delete(int id);

    /**
    * 更新
    */
    public Integer update(Teacher teacher);

    /**
    * 根據主鍵 id 查詢
     * @param n 
    */
    public List<Teacher> load(Integer n);

  


}
