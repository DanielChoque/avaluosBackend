package com.html.avaluos;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
//@EnableWebMvc
public class WebConfig 
extends WebMvcConfigurerAdapter
{
	 @Override
	    public void addCorsMappings(CorsRegistry registry) {
	        registry.addMapping("/**");
	    }
	 /*@Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/notFound").setViewName("forward:/index.html");
	    }*/
}
