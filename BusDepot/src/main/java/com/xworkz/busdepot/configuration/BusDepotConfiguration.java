package com.xworkz.busdepot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.xworkz.busdepot")
public class BusDepotConfiguration {
    public BusDepotConfiguration(){
        System.out.println("BusDepot Configuration.................");
    }

    @Bean
    public InternalResourceViewResolver viewResolver(){
        return new InternalResourceViewResolver("/",".jsp");
    }
}
