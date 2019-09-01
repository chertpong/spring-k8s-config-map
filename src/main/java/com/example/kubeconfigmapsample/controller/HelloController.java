package com.example.kubeconfigmapsample.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
    @Value("${hello.message}")
    private String helloMessage;
    @Value("${business.message:'not found'}")
    private String business;

    @GetMapping("/")
    public Map<String, Object> hello() {
        Map<String, Object> result = new HashMap<>();
        result.put("message", helloMessage);
        result.put("business", business);
        return result;
    }
}
