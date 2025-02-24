package com.example.securing_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //indica q é uma class de configuração
public class MvcConfig implements WebMvcConfigurer  {

   // WebMvcConfigurer __ interface do spring mvc para personalizar a config - config como roteamento...


    public void addViewControllers(ViewControllerRegistry registry) {


        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/master").setViewName("master");
    }

}
