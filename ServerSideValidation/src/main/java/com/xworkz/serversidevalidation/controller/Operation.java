package com.xworkz.serversidevalidation.controller;

import com.xworkz.serversidevalidation.dto.BookDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import org.springframework.web.bind.annotation.RequestMapping;


import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class Operation {
    public Operation(){
        System.out.println("Operation............................");
    }

    @RequestMapping("book")
    public String getBookForm(){
        return "bookform";
    }

    @RequestMapping("BookServlet")
    public String bookSubmitted(@Valid BookDTO bookDTO ,BindingResult bindingResult,Model model){
        System.out.println(bookDTO.getBookName()+" "+bookDTO.getAuthor());

        System.out.println(bindingResult.hasErrors());

        if(bindingResult.hasErrors()){
            System.out.println("has error");
            System.out.println(bindingResult);
            List<ObjectError> ObjectErrors = bindingResult.getAllErrors();
            for(ObjectError objectError:ObjectErrors){
                System.out.println(objectError.getDefaultMessage());
            }
            model.addAttribute("Submitted","Book ");
        }
        return "booksubmitted";
    }

}
