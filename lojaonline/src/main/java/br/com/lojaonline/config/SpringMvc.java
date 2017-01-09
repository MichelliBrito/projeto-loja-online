package br.com.lojaonline.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//classe de configuração do springmvc na aplicação, aq sao passados para o servlet container que o springmvc sera responsável por receber as requisições que chegarem partindo da raiz do projeto "/".
public class SpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {Securityconfig.class, AppConfig.class, JPAConfig.class};//mostra ao spring a classe de config. da aplicaçao web
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {};//mostra ao spring a classe de config. da aplicaçao web
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};//SpringMvc atenderá as requisições a partir de ("/") raiz do projeto.
	}

}
