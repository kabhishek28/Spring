package com.xworkz.form.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FormConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
    public FormConfiguration(){
        System.out.println("FormConfiguration..................");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ FormContainer.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
