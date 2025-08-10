package com.xworkz.blogslinks.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ItemInitializeConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
    public ItemInitializeConfiguration() {
        System.out.println("Item as Initialized.......");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/soap","/checkSoap","/butter","/checkButter","/bottel","/checkBottle","/shoe","/checkShoe","/chappal","/checkChappal","/socks","/checkSocks","/chutney","/checkChutney","/onion","/checkOnion","/milk","/checkMilk","/curry","/checkCurry","/biryani","/checkBiryani","/parota","/checkParota","/egg","/checkEgg"};
    }

    @Override

    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                ItemConfiguration.class
        };
    }
}
