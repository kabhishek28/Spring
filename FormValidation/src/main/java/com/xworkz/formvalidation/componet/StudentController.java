package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.StudentDto;
import com.xworkz.formvalidation.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class StudentController {

    public StudentController() {
        System.out.println("const studentcontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("student")
    public ModelAndView getStudent(@Valid StudentDto studentDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.addObject("error", bindingResult.getAllErrors());
        }
        trainerService.saveStudent(studentDto);

        modelAndView.setViewName("Student");
        return modelAndView;
    }
}
