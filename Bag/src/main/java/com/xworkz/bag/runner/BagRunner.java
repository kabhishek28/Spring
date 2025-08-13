package com.xworkz.bag.runner;

import com.xworkz.bag.component.TravelBag;
import com.xworkz.bag.configuration.BagConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BagRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BagConfiguration.class);
        TravelBag travelBag = applicationContext.getBean(TravelBag.class);
        travelBag.getTruckBag();

    }
}
