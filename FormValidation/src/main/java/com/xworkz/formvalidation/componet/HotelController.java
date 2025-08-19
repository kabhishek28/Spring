package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.HotelDto;
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
public class HotelController {
    public HotelController() {
        System.out.println("const hotelcontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("hotel")
    public ModelAndView getHotel(@Valid HotelDto hotelDto, ModelAndView modelAndView, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("error", errors);
        }

        trainerService.saveHotel(hotelDto);

        modelAndView.setViewName("Hotel");
        return modelAndView;
    }
}
