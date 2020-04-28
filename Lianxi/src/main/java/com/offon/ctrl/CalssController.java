package com.offon.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.offon.model.Calss;
import com.offon.service.CalssService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
* calss
* @author ����
* @date 2019/09/20
*/
@RestController
@RequestMapping(value = "/Calss")
public class CalssController {

    @Resource
    private CalssService calssService;

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/insert")
    public Integer insert(){
    	Calss calss = new Calss();
    	calss.setCalssid(88);
    	calss.setCalssname("张嘎");
        return calssService.insert(calss);
    }

    /**
    * [�h��]
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/delete")
    public Integer delete(int id){
        return calssService.delete(id);
    }

    /**
    * [����]
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/update")
    public Integer update(Calss calss){
        return calssService.update(calss);
    }

    /**
    * [��ԃ] �������I id ��ԃ
    * @author ����
    * @date 2019/09/20
    **/
    @RequestMapping("/load")
    public List<Calss> load(){
        return calssService.load();
    }

   
//    @RequestMapping("/load1")
//	  public List<Calss> load(){
//    	Integer n = 1;
//	      return calssService.load1(n);
//	    
//    }
}
