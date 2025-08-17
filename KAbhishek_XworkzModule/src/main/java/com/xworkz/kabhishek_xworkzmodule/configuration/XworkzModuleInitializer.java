package com.xworkz.kabhishek_xworkzmodule.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class XworkzModuleInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
   public XworkzModuleInitializer(){
       System.out.println("XworkzModuleInitializer.................");
   }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                XworkzModuleConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
