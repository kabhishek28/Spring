package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.ShoeDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Shoe {
    Shoe(){
        System.out.println("Const Shoe........");
    }

    @RequestMapping("/checkShoe")
    public String checkShoe(ShoeDTO shoeDTO ){
        System.out.println("Shoe Only for Men's");
        System.out.println("Shoe Brand: " + shoeDTO.getShoeBrand());
        System.out.println("Shoe Price: " + shoeDTO.getShoePrice());
        System.out.println("Shoe Size: " + shoeDTO.getShoeSize());

        return "shoe";
    }
}
