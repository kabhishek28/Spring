package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Parota {
    Parota(){
        System.out.println("Const Parota...........");
    }

    @RequestMapping("/checkParota")
    public String getParota(){
        System.out.println("Parota is Available........");
        return "parota.jsp";
    }
}
