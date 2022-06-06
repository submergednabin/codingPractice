package com.test.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//	@Autowired
//	private UserDetailsService userDetailService;
//	
//	@Bean
//	public AuthenticationProvider authProvider() {
//		
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setUserDetailsService(userDetailService);
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
//		return provider;
//		
//	}
//	
//	@Override
//	@Bean
//	public AuthenticationManager authenticationManagerBean() throws Exception {
//		return super.authenticationManagerBean();
//				
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http.csrf().disable()
		.cors()
		.and()
		.authorizeHttpRequests()
			.antMatchers(HttpMethod.POST,"/**","login").permitAll()
			.antMatchers(HttpMethod.GET,"/**").permitAll()
			.antMatchers(HttpMethod.PUT,"/**").permitAll()
			.antMatchers(HttpMethod.DELETE,"/**").permitAll()
			.anyRequest().authenticated();
		
	}
	
}
