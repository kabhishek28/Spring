package com.xworkz.formvalidation.componet;

import com.xworkz.formvalidation.dto.EmployeeDto;
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
public class EmployeeController {
    public EmployeeController() {
        System.out.println("const employeecontroller....");
    }
    @Autowired
    TrainerService trainerService;
    @RequestMapping("employee")
    public ModelAndView getEmployee(@Valid EmployeeDto employeeDto, BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            List<ObjectError> errors = bindingResult.getAllErrors();
            modelAndView.addObject("errors", errors);
        }
        trainerService.saveEmployee(employeeDto);
        modelAndView.setViewName("Employee");
        return modelAndView;
    }
}
