package com.example.demo.models;

import java.util.HashSet;
import java.util.Set;

public class AuthRequest {

	String username;
	String password;
	String email;
	Set<String> roles = new HashSet<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public AuthRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public AuthRequest(String username, String password,String email) {
		super();
		this.username = username;
		this.password = password;
		this.email=email;
	}

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

	public Set<String> getRoles() {
		return roles;
	}

	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}

	
}
