package com.xworkz.blogslinks.component;

import com.xworkz.blogslinks.dto.ChappalDTO;
import com.xworkz.blogslinks.dto.ChutenyDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Chutney {
    Chutney(){
        System.out.println("Chutney const........");
    }

    @RequestMapping("/checkChutney")
    public String checkChutney(ChutenyDTO chutenyDTO){
        System.out.println("WE Don't have Chutney....");

        System.out.println("Chutney Type: " + chutenyDTO.getChutneyType());
        System.out.println("Chutney Price: " + chutenyDTO.getChutneyPrice());
        System.out.println("Chutney Quantity: " + chutenyDTO.getChutneyQuantity());

        return "chutney.jsp";
    }
}
