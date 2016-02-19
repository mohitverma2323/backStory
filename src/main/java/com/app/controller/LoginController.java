package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.service.LoginAuthenticationService;

@RestController
public class LoginController {
	@Autowired 
	private LoginAuthenticationService loginAuthenticationService; 
	@RequestMapping(name="/login")
	public String login(@RequestParam String userName,@RequestParam String password){
		
		return "{ value:"+loginAuthenticationService.verifyLogin(userName, password)+" }";
	}
}
