package com.offon.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.offon.model.Calss;

import java.util.List;

/**
* calss
* @author ����
* @date 2019/09/20
*/
@Mapper
@Repository
public interface CalssMapper {

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    int insert( Calss calss);

    /**
    * [�h��]
    * @author ����
    * @date 2019/09/20
    **/
    int delete(@Param("id") int id);

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    int update( Calss calss);

    /**
    * [��ԃ] �������I id ��ԃ
    * @author ����
     * @param integer 
    * @date 2019/09/20
    **/
    List<Calss> load();

    List<Calss> load1(Integer integer);

   
}
