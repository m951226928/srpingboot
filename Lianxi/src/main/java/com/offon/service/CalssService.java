package com.offon.service;

import java.util.List;
import java.util.Map;

import com.offon.model.Calss;

/**
* calss
* @author ����
* @date 2019/09/20
*/
public interface CalssService {

    /**
    * ����
    */
    public Integer insert(Calss calss);

    /**
    * ɾ��
    */
    public Integer delete(int id);

    /**
    * ����
    */
    public Integer update(Calss calss);

    /**
    * �������I id ��ԃ
    */
    public List<Calss> load();

    public List<Calss> load1(Integer n);
}

