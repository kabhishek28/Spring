package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Biryani {
    Biryani(){
        System.out.println("Biryani const.........");
    }

    @RequestMapping("/checkBiryani")
    public String checkBiryani(){
        System.out.println("Biryani is Available..........");
        return "biryani.jsp";
    }
}
