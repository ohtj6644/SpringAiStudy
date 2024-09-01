package com.example.demoSpringAi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class view {

    @GetMapping("/")
    public  String chatView(Model model){
        return "chat";
    }
}
