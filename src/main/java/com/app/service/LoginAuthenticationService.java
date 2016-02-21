package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.dao.LoginDao;
import com.app.pojo.User;

@Service
public class LoginAuthenticationService {
	@Autowired(required = true)
	private LoginDao loginDao;

	public boolean verifyLogin(String userName, String password) {
		User user = loginDao.getUserDetails(userName);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encryptedPassword = encoder.encode(password);
		if (password != null && user.getPassword().equals(encryptedPassword))
			return true;
		return false;
	}
}
