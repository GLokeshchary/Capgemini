package com.main.question1;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig  extends WebSecurityConfigurerAdapter{
	protected void configure(AuthenticationManagerBuilder auth) throws Exception 
	{
		auth.inMemoryAuthentication()
		    .withUser("lokesh")
		    .password("loki")
		    .roles("USER")
		    .and()
		    .withUser("kumar")
		    .password("kumar")
		    .roles("Admin");
	}
	protected void configure(HttpSecurity httpSecurity) throws Exception 
	{
		httpSecurity.csrf().disable().authorizeRequests()
		                             .antMatchers("/home").hasAnyRole("Admin","USER")
		                             .and()
		                             .formLogin().loginPage("/login").permitAll()
		                             .and()
		                             .rememberMe().key("rem-me-key")
		                             .rememberMeParameter("remember")
		                             .rememberMeCookieName("rememberlogin");
	}
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		PasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder;
	}
	

}
