package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.app.pojo.User;

public class LoginDao {
	@PersistenceContext
	private EntityManager entityManager;
	public User getUserDetails(String userName){
		User user=entityManager.find(User.class, userName);
		return user;
	}
}
