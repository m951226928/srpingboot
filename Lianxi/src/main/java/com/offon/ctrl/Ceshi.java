package com.offon.ctrl;

import java.io.File;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("document")
public class Ceshi {

	@RequestMapping(value ="createbyfile" ,method =  RequestMethod.POST)
	public void cs(File file){
		
		
	}
}
