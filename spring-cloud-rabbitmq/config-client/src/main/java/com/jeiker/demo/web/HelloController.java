package com.jeiker.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/22 下午3:17
 */
@RestController
public class HelloController {

    @Value("${message}")
    String message;

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam String name) {
        Map<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("message", message);
        return result;
    }
}