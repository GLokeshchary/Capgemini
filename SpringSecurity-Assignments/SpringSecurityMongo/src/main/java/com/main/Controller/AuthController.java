package com.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.models.AuthRespose;
import com.main.models.AuthenticationRequest;
import com.main.models.User;
import com.main.respository.UserRepository;

@RestController
public class AuthController {
	@Autowired
	UserRepository repository;
	
	@Autowired
	AuthenticationManager authenticationManager;
	@PostMapping("/subs")
	public ResponseEntity<?> subscribe(@RequestBody AuthenticationRequest authenticationRequest)
	{
		String username=authenticationRequest.getUsername();
		String password=authenticationRequest.getPassword();
		try {
			repository.save(new User("101",username,password ));
		} catch (Exception e) {
			return ResponseEntity.ok(new AuthRespose("Error Adding to database"+username));
		}
		return ResponseEntity.ok(new AuthRespose("Successfully added to database"+username));
	}
	
	@PostMapping("/auth")
	public ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest)
	{
		String username=authenticationRequest.getUsername();
		String password=authenticationRequest.getPassword();
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		} catch (BadCredentialsException e) {
			return ResponseEntity.ok(new AuthRespose("Authecated Failed"+username));
		}
		return ResponseEntity.ok(new AuthRespose("Authecated Successfully"+username));
	}

}
