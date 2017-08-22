package com.jeiker.demo.web;

import com.jeiker.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/22 下午1:45
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public Map<String, String> hello(@RequestParam String name) {
        return helloService.hello(name);
    }
}
