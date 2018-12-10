package com.chb.feign.controller.feignInterface.Impl;

import com.chb.feign.controller.feignInterface.SchedualServiceHello;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHello {
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry " + name;
    }
}
