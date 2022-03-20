package com.example.demo;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.AuthRequest;
import com.example.demo.models.AuthResponse;
import com.example.demo.models.ERole;
import com.example.demo.models.Login;
import com.example.demo.models.MessageResponse;
import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.util.JwtUtil;

@RestController
@RequestMapping("/api/auth")
public class HelloController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	@Autowired
	MYUserDetailsService detailsService;
	@Autowired
	JwtUtil jwtUtil;
	@Autowired
	UserRepository userRepository;
	@Autowired
	RoleRepository roleRepository;
	
	@PostMapping("/signup")
	public ResponseEntity<?> AddUser(@RequestBody AuthRequest authRequest) throws Exception
	{
		if (userRepository.existsByUsername(authRequest.getUsername())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Username is already taken!"));
		}
		if (userRepository.existsByEmail(authRequest.getEmail())) {
			return ResponseEntity
					.badRequest()
					.body(new MessageResponse("Error: Email is already in use!"));
		}
		// Create new user's account
				User user = new User(authRequest.getUsername(), 
						             authRequest.getEmail(),
						             authRequest.getPassword());
				Set<String> strRoles = authRequest.getRoles();
				Set<Role> roles = new HashSet<>();
				if (strRoles == null) {
					Role userRole = roleRepository.findByName(ERole.ROLE_USER)
							.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
					roles.add(userRole);
				} else {
					strRoles.forEach(role -> {
						switch (role) {
						case "admin":
							Role adminRole = roleRepository.findByName(ERole.ROLE_ADMIN)
									.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
							roles.add(adminRole);
							break;
						case "mod":
							Role modRole = roleRepository.findByName(ERole.ROLE_MODERATOR)
									.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
							roles.add(modRole);
							break;
						default:
							Role userRole = roleRepository.findByName(ERole.ROLE_USER)
									.orElseThrow(() -> new RuntimeException("Error: Role is not found."));
							roles.add(userRole);
						}
					});
				}
				user.setRoles(roles);
				userRepository.save(user);
				return ResponseEntity.ok(new MessageResponse("User registered successfully!"));
	}
	@PostMapping("/signin")
	public ResponseEntity<?> createtoken(@RequestBody Login authRequest) throws Exception
	{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		} catch (BadCredentialsException e) {
			
			throw new Exception("Incorrect Username or password");
		}
		final UserDetails userDetails=detailsService.loadUserByUsername(authRequest.getUsername());
		final String jwt=jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthResponse(jwt));
		
	}

}
