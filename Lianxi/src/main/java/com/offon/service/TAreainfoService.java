package com.offon.service;

import java.util.List;
import java.util.Map;

import com.offon.model.TAreainfo;

/**
* t_areainfo
* @author ����
* @date 2019/09/21
*/
public interface TAreainfoService {

    /**
    * ����
    */
    public Integer insert(TAreainfo tAreainfo);

    /**
    * ɾ��
    */
    public Integer delete(int id);

    /**
    * ����
    */
    public Integer update(TAreainfo tAreainfo);

    /**
    * �������I id ��ԃ
    */
    public List<TAreainfo> load();

  

}
