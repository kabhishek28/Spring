package com.xworkz.watertank.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WaterTankConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

    WaterTankConfiguration(){
        System.out.println("calling water tank Configuration................");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
            WaterTankConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
