package com.xworkz.blogslinks.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class AllComponent {
    public AllComponent(){
        System.out.println("Const of All Components........");
    }

    @RequestMapping("/soap")
    public String getSoapPage(){
        return "soap";
    }

    @RequestMapping("/butter")
    public String getButterPage(){
        return "butter";
    }

    @RequestMapping("/bottel")
    public String getBottel(){
        return "bottle";
    }

    @RequestMapping("shoe")
    public String getShoe(){
        return "shoe";
    }

    @RequestMapping("/chappal")
    public String getChappal(){
        return "chappal";
    }

    @RequestMapping("/socks")
    public String getSocks(){
        return "socks";
    }

    @RequestMapping("/chutney")
    public String getChutney(){
        return "chutney";
    }

    @RequestMapping("/onion")
    public String getOnion(){
        return "onion";
    }

    @RequestMapping("/milk")
    public String getMilk(){
        return "milk";
    }

    @RequestMapping("/curry")
    public String getCurry(){
        return "curry";
    }

    @RequestMapping("/biryani")
    public String getBiryani(){
        return "biryani";
    }

    @RequestMapping("/parota")
    public String getParota(){
        return "parota";
    }

    @RequestMapping("/egg")
    public String getEgg(){
        return "egg";
    }


}
