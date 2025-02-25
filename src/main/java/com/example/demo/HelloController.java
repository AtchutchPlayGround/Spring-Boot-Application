package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Project to test GitHub Actions with Chef Workstation Integration.";
    }

    @GetMapping("/tst")
    public String sayTst() {
        return "Chef Integration.";
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "Just Saying Hi.";
    }

    @GetMapping("/desc")
    public String describe() {
        return "This is a sample project to test GitHub Actions.";
    }

    @GetMapping("/testPath")
    public String te() {
        return "Sample test path.";
    }
}
