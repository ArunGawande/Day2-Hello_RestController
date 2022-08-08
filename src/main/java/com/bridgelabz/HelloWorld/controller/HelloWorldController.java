package com.bridgelabz.HelloWorld.controller;

import com.bridgelabz.HelloWorld.dto.User;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("")
    public String getrequest()
    {
        return "Hello From BridgeLabz..!!";
    }
}



