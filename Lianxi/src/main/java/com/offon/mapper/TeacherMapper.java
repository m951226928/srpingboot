package com.offon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.offon.model.Teacher;

import java.util.List;

/**
* teacher
* @author 张瑞博
* @date 2019/09/20
*/
@Mapper
public interface TeacherMapper {

    /**
    * [新增]
    * @author 张瑞博
    * @date 2019/09/20
    **/
    int insert( Teacher teacher);

    /**
    * [刪除]
    * @author 张瑞博
    * @date 2019/09/20
    **/
    int delete( int id);

    /**
    * [更新]
    * @author 张瑞博
    * @date 2019/09/20
    **/
    int update( Teacher teacher);

    /**
    * [查詢] 根據主鍵 id 查詢
    * @author 张瑞博
     * @param n 
    * @date 2019/09/20
    **/
   List<Teacher> load(Integer n);


 

}
