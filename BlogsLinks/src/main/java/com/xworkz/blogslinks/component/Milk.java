package com.xworkz.blogslinks.component;


import com.xworkz.blogslinks.dto.MilkDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Milk {
    Milk(){
        System.out.println("milk const.....");
    }

    @RequestMapping("/checkMilk")
    public String checkMilk(MilkDTO milkDTO){
        System.out.println("Milk is Available..........");
        System.out.println("Milk Type: " + milkDTO.getMilkType());
        System.out.println("Milk Price: " + milkDTO.getMilkPrice());
        System.out.println("Milk Quantity: " + milkDTO.getMilkQuantity());

        return "milk.jsp";
    }
}
