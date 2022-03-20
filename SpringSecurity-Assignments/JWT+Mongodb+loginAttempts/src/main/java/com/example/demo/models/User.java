package com.example.demo.models;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	@Id
	private String id;
	private String username;
	private String email;
	private String password;
	@DBRef
	private Set<Role> roles = new HashSet<>();
	private boolean Account_non_locked;
	private int failed_attempts;
	private Date lock_time;

	public User() {
	}

	public User(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public boolean isAccount_non_locked() {
		return Account_non_locked;
	}

	public void setAccount_non_locked(boolean account_non_locked) {
		Account_non_locked = account_non_locked;
	}

	public int getFailed_attempts() {
		return failed_attempts;
	}

	public void setFailed_attempts(int failed_attempts) {
		this.failed_attempts = failed_attempts;
	}

	public Date getLock_time() {
		return lock_time;
	}

	public void setLock_time(Date lock_time) {
		this.lock_time = lock_time;
	}

}