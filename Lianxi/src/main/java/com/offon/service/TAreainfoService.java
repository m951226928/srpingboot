package com.offon.service;

import java.util.List;
import java.util.Map;

import com.offon.model.TAreainfo;

/**
* t_areainfo
* @author 张瑞博
* @date 2019/09/21
*/
public interface TAreainfoService {

    /**
    * 新增
    */
    public Integer insert(TAreainfo tAreainfo);

    /**
    * 删除
    */
    public Integer delete(int id);

    /**
    * 更新
    */
    public Integer update(TAreainfo tAreainfo);

    /**
    * 根據主鍵 id 查詢
    */
    public List<TAreainfo> load();

  

}
