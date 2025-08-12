package com.xworkz.blogslinks.component;


import com.xworkz.blogslinks.dto.ChappalDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Chappal {
    Chappal(){
        System.out.println("Chappal const...........");
    }

    @RequestMapping("/checkChappal")
    public String checkChappal(ChappalDTO chappalDTO){
        System.out.println("Chappal is Available only for Female's");
        System.out.println("Chappal Brand: " + chappalDTO.getChappalBrand());
        System.out.println("Chappal Price: " + chappalDTO.getChappalPrice());
        System.out.println("Chappal Size: " + chappalDTO.getChappalSize());

        return "result";
    }
}
