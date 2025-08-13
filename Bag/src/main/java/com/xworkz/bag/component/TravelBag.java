package com.xworkz.bag.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TravelBag {

    @Autowired
    private TruckBag truckBag;

    public void getTruckBag(){
        System.out.println("running travel BAg");
        truckBag.getBag();
    }
}
