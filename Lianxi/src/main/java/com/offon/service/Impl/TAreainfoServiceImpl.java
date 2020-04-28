package com.offon.service.Impl;

import org.springframework.stereotype.Service;

import com.offon.mapper.TAreainfoMapper;
import com.offon.model.TAreainfo;
import com.offon.service.TAreainfoService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* t_areainfo
* @author ÕÅÈð²©
* @date 2019/09/21
*/
@Service
public class TAreainfoServiceImpl implements TAreainfoService {

	@Resource
	private TAreainfoMapper tAreainfoMapper;


	public Integer insert(TAreainfo tAreainfo) {

		
        return tAreainfoMapper.insert(tAreainfo);
	}


	public Integer delete(int id) {
		return tAreainfoMapper.delete(id);
	}


	public Integer update(TAreainfo tAreainfo) {
		return tAreainfoMapper.update(tAreainfo);
	}


	public List<TAreainfo> load() {
		
		List<TAreainfo> load = tAreainfoMapper.load(1);
		for (TAreainfo tAreainfo : load) {
			List<TAreainfo> load1 = tAreainfoMapper.load1(tAreainfo.getId());
		     tAreainfo.setListTAreainfo(load1);
		}
		
		return load;
	}


	

}
