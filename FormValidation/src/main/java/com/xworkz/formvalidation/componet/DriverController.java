package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.DriverDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class DriverController {
    public DriverController(){
        System.out.println("const drivercontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("driver")
    public ModelAndView getDriver(@Valid DriverDto driverDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }
        trainerService.saveDriver(driverDto);
        modelAndView.setViewName("Driver");
        return modelAndView;
    }

}
