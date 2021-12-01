package com.mindtree.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.app.entity.QuarantineCenter;
import com.mindtree.app.service.QuarantineService;

@Controller
public class HomeController {
	@Autowired
	private QuarantineService service;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome";
	}
	@RequestMapping(value="/store",method=RequestMethod.GET)
	public String activityAdd(@RequestParam String name) {
		QuarantineCenter quarantine=new QuarantineCenter();
		quarantine.setPlaceName(name);
		try {
			service.save(quarantine);
			
		}catch(DataAccessException e) {
			e.printStackTrace();
		}
		
		return "patient";
		
	}
	

}
