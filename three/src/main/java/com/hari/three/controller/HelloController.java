package com.hari.three.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hari")
public class HelloController {

    @GetMapping("/name")
    public int getname() {
        return(20);
    }
    @GetMapping("/sunday")
    public String getsunday() {
        return("monday");
    }

}
