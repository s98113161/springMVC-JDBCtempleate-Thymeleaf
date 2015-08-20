package com.kang.springdemo.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.http.HttpRequest;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import com.kang.springdemo.dao.StudentDAO;
import com.kang.springdemo.dao.StudentDAOImpl;

@Configuration
@ComponentScan(basePackages="com.kang.springdemo")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter{

//	@Bean
//	public ViewResolver getViewResolver(){
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		return resolver;
//	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/html/**").addResourceLocations("/html/");
        registry.addResourceHandler("/images/**").addResourceLocations("/images/");
    
	}
	
	@Bean
	public TemplateResolver getTemplateResolver(){
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
        templateResolver.setPrefix("/WEB-INF/templates/");
        templateResolver.setSuffix(".html");
        templateResolver.setCharacterEncoding("UTF-8");
        templateResolver.setCacheTTLMs(3600000L);
        templateResolver.setTemplateMode("HTML5");
//        templateResolver.setTemplateMode("XHTML");
		return templateResolver;
	}
	
//	@Bean
//	public SpringTemplateEngine getTemplateEngine(){
//		 TemplateEngine templateEngine = new TemplateEngine();
//		  templateEngine.setTemplateResolver(getTemplateResolver());
//		return templateEngine;
//	}
	
	
	@Bean
	public SpringTemplateEngine getTemplateEngine(){
		 SpringTemplateEngine templateEngine = new SpringTemplateEngine();

	        templateEngine.setTemplateResolver(getTemplateResolver());
	        return templateEngine;
	}
	@Bean
    public ViewResolver viewResolver(){
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver() ;
        viewResolver.setTemplateEngine(getTemplateEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        viewResolver.setOrder(1);

        return viewResolver;
    }
	//I18n...
	 @Bean
	    @Description("Spring message resolver")
	    public ResourceBundleMessageSource messageSource() {  
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();  
	        messageSource.setBasename("/i18n/messages");  
	        
	        return messageSource;  
	    }
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/demo");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		
		return dataSource;
	}
	
	@Bean
	public StudentDAO getStudentDAO() {
		return new StudentDAOImpl(getDataSource());
	}
}
