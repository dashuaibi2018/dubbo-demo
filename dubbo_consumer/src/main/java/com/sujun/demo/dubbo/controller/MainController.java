/*
package com.sujun.demo.dubbo.controller;

import com.sujun.demo.dubbo.service.IDemoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class MainController {

    @Reference(version = "1.0.0")
    IDemoService iDemoService;

    @RequestMapping("say")
    public String say() {

        String s = iDemoService.say("aoteman");
        System.out.println(s);
        return s;
    }


}*/
