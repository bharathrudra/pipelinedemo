package com.example.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ctr")
public class Controller {

    @GetMapping("/get")
    public String getMessage() {
        return "get call Success !!";
    }
}
