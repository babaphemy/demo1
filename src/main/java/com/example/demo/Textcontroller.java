package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Textcontroller {
    @GetMapping("/demo")
    public String demo(){
        return "index";
    }
}
