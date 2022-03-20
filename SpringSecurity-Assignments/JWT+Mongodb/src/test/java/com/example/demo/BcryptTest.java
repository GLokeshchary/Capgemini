package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTest {
	@Test
	public void display()
	{
		String rawpass="java4562";
		BCryptPasswordEncoder passwordencoder = new BCryptPasswordEncoder();
		String encoded=passwordencoder.encode(rawpass);
		System.out.println(encoded);
	}

}
