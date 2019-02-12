package com.daochao.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigValueController {
    @Value("${foo}")
    String foo;
//    String foo = "haha";

    @RequestMapping(value = "/getValue")
    public String getValue(){
        return foo;
    }
}
