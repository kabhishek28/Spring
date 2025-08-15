package com.xworkz.busdepot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class BusDepotConfigurationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    public BusDepotConfigurationInitializer(){
        System.out.println("BusDepot Configuration Initialized.............");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                BusDepotConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


}
