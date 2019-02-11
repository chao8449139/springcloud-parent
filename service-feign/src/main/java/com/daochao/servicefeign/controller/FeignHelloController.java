package com.daochao.servicefeign.controller;

import com.daochao.servicefeign.remote.FeignHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {
    @Autowired
    FeignHelloService feignHelloService;

    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return feignHelloService.sayHelloFromClientOne(name);
    }
}
