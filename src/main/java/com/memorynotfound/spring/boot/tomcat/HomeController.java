package com.memorynotfound.spring.boot.tomcat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome(){
        return "Hello, World";
    }
}
