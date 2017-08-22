package com.jeiker.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/22 下午1:45
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public Map<String, String> hello(String name) {
        return restTemplate.getForObject("http://SERVICE-APP/hello?name=" + name, Map.class);
    }
}
