package com.xworkz.serversidevalidation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public  class ServerSideValidationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


   public ServerSideValidationInitializer(){
       System.out.println("ServerSideValidationInitializer................................");
   }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                ServerSideValidationConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
