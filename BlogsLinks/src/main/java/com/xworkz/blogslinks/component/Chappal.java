package com.xworkz.blogslinks.component;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Chappal {
    Chappal(){
        System.out.println("Chappal const...........");
    }

    @RequestMapping("/checkChappal")
    public String checkChappal(){
        System.out.println("Chappal is Available only for Female's");
        return "chappal.jsp";
    }
}
