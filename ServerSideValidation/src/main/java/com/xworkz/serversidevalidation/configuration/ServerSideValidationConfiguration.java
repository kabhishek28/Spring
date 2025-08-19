package com.xworkz.serversidevalidation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.serversidevalidation")
public class ServerSideValidationConfiguration  {

    public ServerSideValidationConfiguration(){
        System.out.println("ServerSideValidationConfiguration............................");
    }

    @Bean
    public InternalResourceViewResolver viewResolver (){
        return new InternalResourceViewResolver("/",".jsp");
    }


}
