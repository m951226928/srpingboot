package com.offon.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.offon.model.Teacher;

import java.util.List;

/**
* teacher
* @author ����
* @date 2019/09/20
*/
@Mapper
public interface TeacherMapper {

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    int insert( Teacher teacher);

    /**
    * [�h��]
    * @author ����
    * @date 2019/09/20
    **/
    int delete( int id);

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    int update( Teacher teacher);

    /**
    * [��ԃ] �������I id ��ԃ
    * @author ����
     * @param n 
    * @date 2019/09/20
    **/
   List<Teacher> load(Integer n);


 

}
