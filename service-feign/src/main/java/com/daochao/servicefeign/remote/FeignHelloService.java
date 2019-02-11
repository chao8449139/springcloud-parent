package com.daochao.servicefeign.remote;

import com.daochao.servicefeign.hystrix.FeignHelloHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hello" ,fallback = FeignHelloHystrix.class)
public interface FeignHelloService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
