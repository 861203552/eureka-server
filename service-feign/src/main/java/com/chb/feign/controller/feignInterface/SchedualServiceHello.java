package com.chb.feign.controller.feignInterface;

import com.chb.feign.controller.feignInterface.Impl.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="hello-service",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHello {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
