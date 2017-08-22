package com.jeiker.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @Author : xiao
 * @Date : 17/8/22 下午1:39
 */
@FeignClient(value = "service-app")
public interface HelloService {

    @GetMapping("/hello")
    Map<String, String> hello(@RequestParam(value = "name") String name);
}
