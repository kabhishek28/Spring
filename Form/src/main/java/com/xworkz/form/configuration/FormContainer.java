package com.xworkz.form.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.xworkz.form")
public class FormContainer {
    FormContainer(){
        System.out.println("FormContainer....................");
    }
}
