package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Chutney {
    Chutney(){
        System.out.println("Chutney const........");
    }

    @RequestMapping("/checkChutney")
    public String checkChutney(){
        System.out.println("WE Don't have Chutney....");
        return "chutney.jsp";
    }
}
