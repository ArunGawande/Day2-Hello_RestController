package com.bridgelabz.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import com.blzasg.RestController.dto.User;;


@RestController

@RequestMapping("/hello")
public class HelloWorldController {
//UC1
    @GetMapping("")
    public String getrequest()
    {
        return "Hello From BridgeLabz..!!";
    }
//UC2
// http://localhost:8081/hello/query?firstName=Arun
    @GetMapping("/query")
    public String showNameWithQuery(@RequestParam String firstName) {
        return " Hello "+ firstName +" From BridgeLabz";
    }
 //Uc 3
 //curl http://localhost:8080/hello/param/Arun -w "\n"

    @GetMapping("/param/{name}")
    public String showNameWithPathVariable(@PathVariable String name) {
        return " Hello "+name+" From BridgeLabz";
    }

}



