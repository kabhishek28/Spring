package com.xworkz.blogslinks.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.blogslinks.component")
public class ItemConfiguration {
    public ItemConfiguration(){
        System.out.println("Item Component Container const called...............");
    }
}
