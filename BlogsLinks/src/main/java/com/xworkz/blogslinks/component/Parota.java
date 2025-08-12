package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.ParotaDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Parota {
    Parota(){
        System.out.println("Const Parota...........");
    }

    @RequestMapping("/checkParota")
    public String getParota(ParotaDTO parotaDTO){
        System.out.println("Parota is Available........");
        System.out.println("Parota Type: " + parotaDTO.getParotaType());
        System.out.println("Parota Price: " + parotaDTO.getParotaPrice());
        System.out.println("Parota Quantity: " + parotaDTO.getParotaQuantity());

        return "result";
    }
}
