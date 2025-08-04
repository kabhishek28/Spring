package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Socks {
    Socks(){
        System.out.println("Socks const..............");
    }

    @RequestMapping("/checkSocks")
    public String checkSocks(){
        System.out.println("Socks is Available....");
        return "socks.jsp";
    }
}
