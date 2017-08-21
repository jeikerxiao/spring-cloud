package com.jeiker.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/21 下午3:42
 */
@Component
public class HelloServiceHystric implements HelloService{

    @Override
    public Map<String, String> hello(@RequestParam String name) {
        Map<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("port", "0000");
        return result;
    }
}
