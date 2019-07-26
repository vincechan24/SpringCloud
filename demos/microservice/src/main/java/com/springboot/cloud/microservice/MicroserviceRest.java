package com.springboot.cloud.microservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
@Slf4j
public class MicroserviceRest {

    @Value("${userid}")
    String userid;

    @RequestMapping("getid")
    public String getUserid() {
        System.out.println(userid);
        return userid;
    }
}
