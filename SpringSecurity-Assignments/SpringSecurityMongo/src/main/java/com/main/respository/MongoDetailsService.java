package com.main.respository;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import com.main.models.User;

@Service
public class MongoDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User foundeduser = userRepository.findByUsername(username);
		if (foundeduser==null)
		{
			throw new UsernameNotFoundException("not found username"+username);
		}
		
		return new myuserdetails(foundeduser); 
	}

	

}
