package com.forezp.servicehi.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hello(@RequestParam(value = "name", defaultValue = "forezp") String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
