package com.xworkz.blogslinks.component;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Bottle {
    Bottle(){
        System.out.println("Const Bottle............");
    }

    @RequestMapping("/checkBottle")
    public String checkBottle(String bottleType,String bottleBrand,int numberOfBottle){

        System.out.println(bottleBrand + ": Bottle is not Available...");
        return "result";
    }
}
