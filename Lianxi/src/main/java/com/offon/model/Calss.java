package com.offon.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
*  calss
* @author ÕÅÈð²© 2019-09-20
*/
public class Calss implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
    * calssid
    */
    private Integer calssid;

    /**
    * calssname
    */
    private String calssname;


    public Calss() {
    }

    public Integer getCalssid() {
        return calssid;
    }

    public void setCalssid(Integer calssid) {
        this.calssid = calssid;
    }

    public String getCalssname() {
        return calssname;
    }

    public void setCalssname(String calssname) {
        this.calssname = calssname;
    }

}