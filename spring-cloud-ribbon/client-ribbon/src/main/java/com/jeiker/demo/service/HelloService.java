package com.jeiker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/17 下午2:07
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public Map<String, String> hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-APP/hello?name="+name, Map.class);
    }
}
