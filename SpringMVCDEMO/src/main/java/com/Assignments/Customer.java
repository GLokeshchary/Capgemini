package com.Assignments;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	@NotNull
	@Size(min=8,max=20,message = "Size must be in between {min} and {max}  ")
	@Pattern(regexp = "[a-zA-Z0-9_.]*")
	String username;
	//@Pattern(regexp = "((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){8,20}$",
            //message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
	String password;
	@NotNull
	@Email(message = "invalid email")
	String email;
	@ValidContact//Customization
	String contact;
    String city;
    @NotNull
    @ValidZipcode//Customization
	long zipcode;
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
