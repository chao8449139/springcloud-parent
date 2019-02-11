package com.daochao.serviceribbon.controller;

import com.daochao.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return helloService.helloService(name);

    }

}
