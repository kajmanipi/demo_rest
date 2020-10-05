package com.example.demo_rest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class DemoRestController {

    @GetMapping("/about")
    public String index() {
        String strInfo = "Social Network, version 1.0";
        return strInfo;
    }
}
