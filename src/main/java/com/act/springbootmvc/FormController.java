package com.act.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class FormController {

    @RequestMapping("/")
    public String home(Model model) {
        System.out.println("Going home...");
        return "index";
    }

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("student") Student student,
            BindingResult bindingResult){ //the errors or bindingResult params have to follow the model object
        if(bindingResult.hasErrors()){
            return "student-form";
        } else {
            System.out.println("the student: " + student.getFirstName()
                    + " " + student.getLastName());
            return "student-confirmation";
        }
    }


}
