package com.offon.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
*  teacher
* @author ÕÅÈð²© 2019-09-20
*/
public class Teacher implements Serializable {
    @Override
	public String toString() {
		return "Teacher [teaid=" + teaid + ", teacalss=" + teacalss + ", teaname=" + teaname + ", CalssList="
				+ CalssList + "]";
	}

	private static final long serialVersionUID = 1L;

    /**
    * teaid
    */
    private Integer teaid;

    /**
    * teacalss
    */
    private Integer teacalss;

    /**
    * teaname
    */
    private String teaname;

    public List<Calss> CalssList;
    
    public List<Calss> getCalssList() {
		return CalssList;
	}

	public void setCalssList(List<Calss> calssList) {
		CalssList = calssList;
	}

	public Teacher() {
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public Integer getTeacalss() {
        return teacalss;
    }

    public void setTeacalss(Integer teacalss) {
        this.teacalss = teacalss;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

}