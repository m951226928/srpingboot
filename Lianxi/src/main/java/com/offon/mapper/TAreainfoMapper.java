package com.offon.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.offon.model.TAreainfo;

import java.util.List;

/**
* t_areainfo
* @author ����
* @date 2019/09/21
*/
@Mapper
@Repository
public interface TAreainfoMapper {

    /**
    * [����]
    * @author ����
    * @date 2019/09/21
    **/
    int insert(TAreainfo tAreainfo);

    /**
    * [�h��]
    * @author ����
    * @date 2019/09/21
    **/
    int delete(@Param("id") int id);

    /**
    * [����]
    * @author ����
    * @date 2019/09/21
    **/
    int update( TAreainfo tAreainfo);

    /**
    * [��ԃ] �������I id ��ԃ
    * @author ����
    * @date 2019/09/21
    **/
    List<TAreainfo> load(Integer id);


    List<TAreainfo> load1(Integer id1);
}

