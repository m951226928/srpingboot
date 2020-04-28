package com.offon.ctrl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.offon.model.TAreainfo;
import com.offon.service.TAreainfoService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
* t_areainfo
* @author ����
* @date 2019/09/21
*/
@RestController
@RequestMapping(value = "/TAreainfo")
public class TAreainfoController {
	 @Value("${dudu.secret}")
		private int name1;
    @Resource
    private TAreainfoService tAreainfoService;

    /**
    * [����]
    * @author ����
    * @date 2019/09/21
    **/
    @RequestMapping("/insert")
    public Integer insert(TAreainfo tAreainfo){
        return tAreainfoService.insert(tAreainfo);
    }

    /**
    * [�h��]
    * @author ����
    * @date 2019/09/21
    **/
    @RequestMapping("/delete")
    public Integer delete(int id){
        return tAreainfoService.delete(id);
    }

    /**
    * [����]
    * @author ����
    * @date 2019/09/21
    **/
    @RequestMapping("/update")
    public Integer update(TAreainfo tAreainfo){
        return tAreainfoService.update(tAreainfo);
    }

    /**
    * [��ԃ] �������I id ��ԃ
    * @author ����
    * @date 2019/09/21
    **/
    @RequestMapping("/load")
    public List<TAreainfo> load(String ss){
    	  System.out.println(ss+"ssss");
        return tAreainfoService.load();
    }

    @RequestMapping("/cs")
    public int cs(){
    	  System.out.println(name1);
        return name1;
    }

}

