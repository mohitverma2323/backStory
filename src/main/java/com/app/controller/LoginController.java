package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.LoginAuthenticationService;

@Controller
public class LoginController {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	@Autowired 
	private LoginAuthenticationService loginAuthenticationService; 
	@RequestMapping("/login")
	public String login(@RequestParam String userName,@RequestParam String password){
		
		return "{ value:"+loginAuthenticationService.verifyLogin(userName, password)+" }";
	}
}
