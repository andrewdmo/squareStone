package com.squarestone.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class LockConfig extends WebSecurityConfigurerAdapter {


//    private final LockHandler1 lockHandler1;

//    @Autowired
//    public lockConfig(LockHandler1 lockHandler1, UserDetailsServiceFl userDetailsServiceFl) {
//        this.lockHandler1 = lockHandler1;
//        this.userDetailsServiceFl = userDetailsServiceFl;
//    }

//    private final
//    UserDetailsServiceFl userDetailsServiceFl;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/**")
            .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
            .withUser("test@test").password("{noop}test").roles("USER")
            .and()
            .withUser("server").password("{noop}server").roles("SERVER", "USER")
            .and()
            .withUser("bar").password("{noop}bar").roles("BAR", "USER")
            .and()
            .withUser("hourly").password("{noop}hourly").roles("HOURLY", "USER")
            .and()
            .withUser("manager").password("{noop}manager").roles("MANAGER", "USER");
    }


}