package com.theotherian.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.*;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   // cấu hình database cho  Security 
  @Autowired
  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
   auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
    auth.inMemoryAuthentication().withUser("user1").password("123").roles("USER");
    auth.inMemoryAuthentication().withUser("user2").password("123").roles("USER");
    auth.inMemoryAuthentication().withUser("user3").password("123").roles("USER");
    auth.inMemoryAuthentication().withUser("user4").password("123").roles("USER");
    auth.inMemoryAuthentication().withUser("user5").password("123").roles("USER");
  }
}