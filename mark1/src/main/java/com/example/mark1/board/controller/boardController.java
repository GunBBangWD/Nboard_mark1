package com.example.mark1.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class boardController {

    @GetMapping("/")
    public  String main(){
        return "index";
    }
}
