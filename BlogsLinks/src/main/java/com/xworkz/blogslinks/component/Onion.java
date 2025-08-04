package com.xworkz.blogslinks.component;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Onion {
    Onion(){
        System.out.println("Onion Const...........");
    }

    @RequestMapping("/checkOnion")
    public String checkOnion(){
        System.out.println("Onion is Available.....");
        return "onion.jsp";
    }
}
