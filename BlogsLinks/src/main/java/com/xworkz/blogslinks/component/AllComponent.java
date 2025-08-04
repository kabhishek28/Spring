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
        return "soap.jsp";
    }

    @RequestMapping("/butter")
    public String getButterPage(){
        return "butter.jsp";
    }

    @RequestMapping("/bottel")
    public String getBottel(){
        return "bottle.jsp";
    }

    @RequestMapping("shoe")
    public String getShoe(){
        return "shoe.jsp";
    }

    @RequestMapping("/chappal")
    public String getChappal(){
        return "chappal.jsp";
    }

    @RequestMapping("/socks")
    public String getSocks(){
        return "socks.jsp";
    }

    @RequestMapping("/chutney")
    public String getChutney(){
        return "chutney.jsp";
    }

    @RequestMapping("/onion")
    public String getOnion(){
        return "onion.jsp";
    }

    @RequestMapping("/milk")
    public String getMilk(){
        return "milk.jsp";
    }

    @RequestMapping("/curry")
    public String getCurry(){
        return "curry.jsp";
    }

    @RequestMapping("/biryani")
    public String getBiryani(){
        return "biryani.jsp";
    }

    @RequestMapping("/parota")
    public String getParota(){
        return "parota.jsp";
    }

    @RequestMapping("/egg")
    public String getEgg(){
        return "egg.jsp";
    }


}
