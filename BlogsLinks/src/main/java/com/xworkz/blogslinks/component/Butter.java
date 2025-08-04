package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class Butter {

        public Butter(){
            System.out.println("Const butter............");
        }

        @RequestMapping("/checkButter")
        public String getButterMessage(){
            System.out.println("Butter is Available...");
            return "butter.jsp";
        }
    }

