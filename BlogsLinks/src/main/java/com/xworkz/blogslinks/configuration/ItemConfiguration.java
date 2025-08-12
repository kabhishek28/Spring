package com.xworkz.blogslinks.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.blogslinks.component")
@EnableWebMvc
public class ItemConfiguration implements WebMvcConfigurer {
    public ItemConfiguration(){
        System.out.println("Item Component Container const called...............");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver resourceViewResolver (){
        return new InternalResourceViewResolver("/" ,".jsp");
    }
    }

