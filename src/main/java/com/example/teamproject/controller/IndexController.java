package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {

    @GetMapping("/")
    public @ResponseBody String index() {
        return "HELLO VSCODE REMOTE MODE !";
    }
    

    @GetMapping("/fire")
    public String fire(){
        return "views/fire";
    }

}
