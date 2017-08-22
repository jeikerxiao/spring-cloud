package com.jeiker.demo.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author : xiao
 * @Date : 17/8/22 下午4:41
 */
@RestController
public class HelloController {

    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public Map<String, String> hello(){
        log.info("calling trace service-app2.");
        return restTemplate.getForObject("http://localhost:8882/message", Map.class);
    }

    @GetMapping("/message")
    public Map<String, String> message() {
        log.info("calling trace service-app2.");
        Map<String, String> result = new HashMap<>();
        result.put("message", "this is service-app2");
        return result;
    }
}
