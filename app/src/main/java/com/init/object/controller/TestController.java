package com.init.object.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.init.object.DebugTest;

@RestController
public class TestController {

    @GetMapping(value = "test")
    public String test(){
        return DebugTest.test();
    }
    
}
