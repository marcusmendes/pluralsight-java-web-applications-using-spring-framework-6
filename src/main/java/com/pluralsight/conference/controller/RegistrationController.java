package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration model) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration model,
                                  BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("There were errors!");
            return "registration";
        }

        System.out.println("Registration: " + model.getName());
        return "redirect:registration";
    }
}
