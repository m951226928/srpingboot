package com.offon.model;

import java.io.Serializable;
import java.util.List;


/**
*  t_areainfo
* @author ÕÅÈð²© 2019-09-21
*/
public class TAreainfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
    * id
    */
    private Integer id;

    /**
    * level
    */
    private Integer level;

    /**
    * name
    */
    private String name;

    /**
    * parentid
    */
    private Integer parentid;

    /**
    * status
    */
    private Integer status;

    private List<TAreainfo> ListTAreainfo;
  
    public List<TAreainfo> getListTAreainfo() {
		return ListTAreainfo;
	}

	public void setListTAreainfo(List<TAreainfo> listTAreainfo) {
		ListTAreainfo = listTAreainfo;
	}

	public TAreainfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}