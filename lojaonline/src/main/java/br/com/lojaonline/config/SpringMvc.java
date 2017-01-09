package br.com.lojaonline.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


//classe de configura��o do springmvc na aplica��o, aq sao passados para o servlet container que o springmvc sera respons�vel por receber as requisi��es que chegarem partindo da raiz do projeto "/".
public class SpringMvc extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {Securityconfig.class, AppConfig.class, JPAConfig.class};//mostra ao spring a classe de config. da aplica�ao web
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {};//mostra ao spring a classe de config. da aplica�ao web
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};//SpringMvc atender� as requisi��es a partir de ("/") raiz do projeto.
	}

}
