package com.xworkz.watertank.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.xworkz.watertank.internal")
public class WaterTankContainer {
    WaterTankContainer(){
        System.out.println("calling water tank Container...............");
    }
}
