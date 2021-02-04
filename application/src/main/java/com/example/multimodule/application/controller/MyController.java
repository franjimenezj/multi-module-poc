package com.example.multimodule.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.service.MyService;
import com.example.multimodule.service.model.Institution;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public Institution home() {
        return myService.message();
    }
}
