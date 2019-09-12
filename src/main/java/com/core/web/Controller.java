package com.core.web;


import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class Controller {
    @Value("${name}")
    String name;
    @RequestMapping("/test")
    public String test(){

        return "TEST-OK:" + name;
    }

    @Autowired
    private AppConfig appConfig;

    @RequestMapping("/apollocfg")
    public String apollocfg(){

        return "APOLLO:" + appConfig.getConfigBean();
    }


}
