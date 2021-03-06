package com.cle.statsNplay.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.csrf() 
				.disable() 
				.authorizeRequests() 
				.antMatchers(HttpMethod.POST, "/**")
				.permitAll() 
				.antMatchers(HttpMethod.GET, "/**") 
				.permitAll() 
				.antMatchers(HttpMethod.DELETE, "/**") 
				.permitAll() 
				.antMatchers(HttpMethod.PUT, "/**") 
				.permitAll() 
				.and() 
				.httpBasic() 
				.and() 
				.sessionManagement() 
				.sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
	}
}