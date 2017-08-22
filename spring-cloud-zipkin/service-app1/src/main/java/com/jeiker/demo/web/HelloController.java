package com.jeiker.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/22 下午4:42
 */
@RestController
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public Map<String, String> hello(){
        // 调用 service-app2 接口
        return restTemplate.getForObject("http://localhost:8883/message", Map.class);
    }

    @GetMapping("/message")
    public Map<String, String> message() {
        Map<String, String> result = new HashMap<>();
        result.put("message", "this is service-app1");
        return result;
    }
}
