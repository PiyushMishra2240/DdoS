package com.serviceTwo.SecondService.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/service")
    public String limitedEndpoint() {
        return "Service two";

    }
}