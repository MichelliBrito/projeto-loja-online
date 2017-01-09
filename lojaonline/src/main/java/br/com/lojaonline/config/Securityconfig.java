package br.com.lojaonline.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.lojaonline.dao.AdminDao;

@EnableWebMvcSecurity
public class Securityconfig extends WebSecurityConfigurerAdapter{
	
	//@Autowired
    //private AdminDao adminDao;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	    http.authorizeRequests()
	    .antMatchers("/home").hasRole("ADMIN")
	    .antMatchers("/").permitAll()
	    .anyRequest().authenticated()
	    .and().formLogin().loginPage("/loginAdmin").permitAll();
	}
}
