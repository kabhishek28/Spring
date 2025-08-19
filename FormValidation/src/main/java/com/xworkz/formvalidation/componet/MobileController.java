package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.MobileDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class MobileController {

    public MobileController() {
        System.out.println("const mobilecontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("mobile")
    public ModelAndView getMobile(@Valid MobileDto mobileDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.saveMobile(mobileDto);
        modelAndView.setViewName("Mobile");
        return modelAndView;
    }
}
