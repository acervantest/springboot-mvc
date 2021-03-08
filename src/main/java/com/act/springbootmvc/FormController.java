package com.act.springbootmvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
        System.out.println(bindingResult);
        if (bindingResult.hasErrors()){
            return "student-form";
        } else {
            System.out.println("the student: " + student.getFirstName()
                    + " " + student.getLastName());
            return "student-confirmation";
        }
    }

    @InitBinder //pre-process all web requests coming into our controller
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);//defined in Spring API
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);//pre-process every string form data, if it only has white space trim it to null
    }

}
