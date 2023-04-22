package com.cjw.exp.cloud.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entrance")
public class Entrance {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
