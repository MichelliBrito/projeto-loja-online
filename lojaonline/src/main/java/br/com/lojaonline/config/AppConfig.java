package br.com.lojaonline.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.lojaonline.controllers.HomeController;
import br.com.lojaonline.controllers.LoginController;
import br.com.lojaonline.dao.AdminDao;

@EnableWebMvc //configuração do projeto usando spring mvc
@ComponentScan(basePackageClasses={HomeController.class, LoginController.class, AdminDao.class})//classes controladas pelo spring, geralmente controllers e daos.
public class AppConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver(){
	    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
	    resolver.setPrefix("/WEB-INF/views/");
	    resolver.setSuffix(".jsp");
	    return resolver;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	    configurer.enable();//configurando para que o SpringMvc acesse as pastas do bootstrap(css, js)
	}
}
