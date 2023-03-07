package com.example.testrunapp2_httprequest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        log.info("[log]" + "["+LocalTime.now()+"] :" + this.getClass().toString());
        return "hello..!";
    }

}
