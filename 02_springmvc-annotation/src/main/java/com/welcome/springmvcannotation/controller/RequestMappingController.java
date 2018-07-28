package com.welcome.springmvcannotation.controller;

import com.welcome.springmvcannotation.base.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RequestMapping 注解学习
 *
 * @author yzx
 * @Date: 2018/7/28 14:25
 */
@RestController
@RequestMapping("/requestMapping")
public class RequestMappingController {

    @RequestMapping("/value")
    public String value() {
        // TODO 处理你的业务
        return "value";
    }

    @RequestMapping(value = "/method", method = {RequestMethod.GET})
    public String mehtod() {
        // TODO 处理你的业务
        return "method";
    }

    @RequestMapping(value = "/consumes", consumes = "application/json")
    public String consumes() {
        // TODO 处理你的业务
        return "consumes";
    }

    @RequestMapping(value = "/produces", produces = "application/json")
    public String produces() {
        // TODO 处理你的业务
        return "produces";
    }

    @RequestMapping(value = "/params", params = "pwd=123456")
    public User params() {
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        return user;
    }

    @RequestMapping(value = "/headers", headers = {"Host=localhost:8080"})
    public String headers() {
        return "headers";
    }
}
