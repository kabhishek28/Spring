package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.ButterDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@Component
@RequestMapping("/")
public class Butter {

        public Butter(){
            System.out.println("Const butter............");
        }

        @RequestMapping("/checkButter")
        public String getButterMessage(ButterDTO butterDTO){
            System.out.println("Butter Name :" + butterDTO.getButterName());
            System.out.println("Butter price :" + butterDTO.getButterPrice());
            System.out.println("Butter is Available...");
            return "butter.jsp";
        }
    }

