package com.sujun.demo.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@DubboService(version = "1.0.0", timeout = 10000, interfaceClass = IDemoService.class)
@Service
public class DemoServiceImpl implements IDemoService {


    @Override
    public String say(String name) {
        System.out.println("来啦~~~！");
        return "hello:" + name;
    }
}