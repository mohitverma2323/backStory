package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	String userId;
	
	String fName;
	
	String lName;
	
	String Email;

	public User()
	{
	
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getUserId() {
		return userId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	
}
