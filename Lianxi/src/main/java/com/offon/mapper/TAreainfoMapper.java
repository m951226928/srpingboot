package com.offon.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.offon.model.TAreainfo;

import java.util.List;

/**
* t_areainfo
* @author 张瑞博
* @date 2019/09/21
*/
@Mapper
@Repository
public interface TAreainfoMapper {

    /**
    * [新增]
    * @author 张瑞博
    * @date 2019/09/21
    **/
    int insert(TAreainfo tAreainfo);

    /**
    * [刪除]
    * @author 张瑞博
    * @date 2019/09/21
    **/
    int delete(@Param("id") int id);

    /**
    * [更新]
    * @author 张瑞博
    * @date 2019/09/21
    **/
    int update( TAreainfo tAreainfo);

    /**
    * [查詢] 根據主鍵 id 查詢
    * @author 张瑞博
    * @date 2019/09/21
    **/
    List<TAreainfo> load(Integer id);


    List<TAreainfo> load1(Integer id1);
}

