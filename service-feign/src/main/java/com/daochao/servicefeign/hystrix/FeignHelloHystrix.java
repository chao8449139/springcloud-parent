package com.daochao.servicefeign.hystrix;

import com.daochao.servicefeign.remote.FeignHelloService;
import org.springframework.stereotype.Component;

@Component
public class FeignHelloHystrix implements FeignHelloService {

    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry " + name + ", error...";
    }
}
