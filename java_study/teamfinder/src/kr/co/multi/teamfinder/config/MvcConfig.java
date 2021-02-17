package kr.co.multi.teamfinder.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "kr.co.multi.teamfinder.controller")
public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
		registry.addResourceHandler("/images/**").addResourceLocations("classpath:/static/images/");
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/assets/");
		registry.addResourceHandler("/user/images/**").addResourceLocations("classpath:/static/images/");
		registry.addResourceHandler("/user/assets/**").addResourceLocations("classpath:/static/assets/");
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/views/",".jsp");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addRedirectViewController("/", "/index");   //수정
		//registry.addViewController("/hhhh").setViewName("hello");
	}
	
	
	
}
