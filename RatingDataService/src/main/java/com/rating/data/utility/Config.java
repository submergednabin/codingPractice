package com.rating.data.utility;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class Config extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable()
		.cors()
		.and()
		.authorizeHttpRequests()
		.antMatchers(HttpMethod.POST,"/**", "login").permitAll()
		.antMatchers(HttpMethod.GET,"/**").permitAll()
		.antMatchers(HttpMethod.PUT,"/**").permitAll()
		.antMatchers(HttpMethod.DELETE,"/**").permitAll()
		.anyRequest().authenticated();
	}


}
