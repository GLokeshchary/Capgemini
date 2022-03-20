package com.example.demo;

import javax.servlet.Filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.example.demo.filters.JwtRequestFilter;


@SuppressWarnings({ "deprecation", "unused" })
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SeurityConfig  extends WebSecurityConfigurerAdapter{
	@Autowired
	private  JwtRequestFilter jwtRequestFilter;
	@Autowired
	private MYUserDetailsService myuserdetaisservice;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
	auth.userDetailsService(myuserdetaisservice);
		
	}
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.csrf().disable().authorizeRequests()
		                             .antMatchers("/api/auth/**").permitAll()
		                             .antMatchers("/api/test/**").permitAll()
		                             .anyRequest()
		                             .authenticated()
		                             .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
	}
	@Bean
	public PasswordEncoder passwordEncoder() 
	{
		return NoOpPasswordEncoder.getInstance();
	}
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception
	{
		return super.authenticationManagerBean();
	}

}
