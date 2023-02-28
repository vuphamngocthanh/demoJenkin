package com.example.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping
    public String view(){
        return "String";
    }
}
