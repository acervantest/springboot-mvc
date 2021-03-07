package com.act.springbootmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String processForm(@ModelAttribute("student") Student student){
        System.out.println("the student: "+ student.getFirstName()
            +" "+ student.getLastName());
        return "student-confirmation";
    }


}
