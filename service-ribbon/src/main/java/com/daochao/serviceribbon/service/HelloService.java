package com.daochao.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String helloService(String name){
        return restTemplate.getForObject("http://SERVICE-HELLO/hello?name=" + name,String.class);
    }

    public String helloError(String name){
        return "hello " + name + ",sorry,error...";
    }
}
