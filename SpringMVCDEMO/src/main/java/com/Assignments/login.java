package com.Assignments;

public class login {
	String username;
	String password;
	String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String username1="lokeshchary";
	String password1="loki@0901";
	String email1="lokeshchary@gmail.com";
	public boolean checking()
	{
		if((username==username1) && (password==password1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
