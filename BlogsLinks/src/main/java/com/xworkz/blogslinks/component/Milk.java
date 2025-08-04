package com.xworkz.blogslinks.component;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Milk {
    Milk(){
        System.out.println("milk const.....");
    }

    @RequestMapping("/checkMilk")
    public String checkMilk(){
        System.out.println("Milk is Available..........");
        return "milk.jsp";
    }
}
