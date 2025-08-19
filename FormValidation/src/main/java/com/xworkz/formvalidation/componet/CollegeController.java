package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.CollegeDto;
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

public class CollegeController {

    public CollegeController() {
        System.out.println("const collegecontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("college")
    public ModelAndView getCollege(@Valid CollegeDto collegeDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }
        trainerService.saveCollege(collegeDto);
        modelAndView.setViewName("College");
        return modelAndView;
    }
}
