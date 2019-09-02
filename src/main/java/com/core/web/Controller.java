package com.core.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class Controller {
    @Value("${name}")
    String name;
    @RequestMapping("/test")
    public String test(){

        return "TEST-OK:" + name;
    }
}
