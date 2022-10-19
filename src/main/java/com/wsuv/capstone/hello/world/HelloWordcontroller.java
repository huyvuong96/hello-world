package com.wsuv.capstone.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordcontroller {
    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }

    @GetMapping("/haha")
    public String haha(){
        return "Ha Ha";
    }

}
