package com.fusemachine.inventory;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	 @Autowired
	 DataSource dataSource;
	
//	@Autowired
//    private UserDetailsService userDetailsService;
	
	 @Autowired
	 public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
	   auth.jdbcAuthentication().dataSource((javax.sql.DataSource) dataSource)
	  .usersByUsernameQuery(
	   "select username,password, enabled from users where username=?")
	  .authoritiesByUsernameQuery(
	   "select username, role from user_roles where username=?");
	 } 

	
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .antMatchers("/login").permitAll()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/")
//                .permitAll()
//                .defaultSuccessUrl("/home")
//                .and()
//            .logout()
//                .permitAll();
    	
    	   http.authorizeRequests()
    	   .antMatchers("/").permitAll() 
    	   .anyRequest().permitAll()
    	   .and()
    	     .formLogin().loginPage("/")
    	     .usernameParameter("username").passwordParameter("password")
    	   .and()
    	     .logout().logoutSuccessUrl("/login?logout") 
    	    .and()
    	    .exceptionHandling().accessDeniedPage("/403")
    	   .and()
    	     .csrf();
    	  }
    }

