package com.app.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.app.pojo.User;
@Component
public class LoginDao {
	@PersistenceContext
	private EntityManager entityManager;
	public User getUserDetails(String userName){
		User user=entityManager.find(User.class, userName);
		return user;
	}
}
