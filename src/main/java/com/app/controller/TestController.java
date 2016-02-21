package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.app.pojo.User;

@Controller
public class TestController {
	
	
	

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody String tester()
	{
		
		System.out.println("Here");
       // User user = new User();
		return "abc";
	}
}
