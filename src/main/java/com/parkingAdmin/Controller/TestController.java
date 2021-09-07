package com.parkingAdmin.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @RequestMapping(value = "/carList")
    public String home() {
        System.out.println("ZZZZZZ"); return "hello";
    }
}
