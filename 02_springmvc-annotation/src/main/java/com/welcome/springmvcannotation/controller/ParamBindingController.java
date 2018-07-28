package com.welcome.springmvcannotation.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * 参数绑定注解
 *
 * @author yzx
 * @Date: 2018/7/28 15:31
 */
@RestController
@RequestMapping("/param")
public class ParamBindingController {

    @RequestMapping("/param")
    public String param(@RequestParam(name = "name", required = true) String name,
                        @RequestParam(name = "pwd") String pwd,
                        @RequestParam(name = "age", required = false, defaultValue = "20") String age) {
        return "我的名字：" + name + "我的密码：不告诉你-" + pwd + "我的年龄：" + age;
    }

    @RequestMapping("/pathVars/{userId}")
    public String pathVars(@PathVariable Integer userId) {
        return "我是动态的，我的id:" + userId;
    }

    @RequestMapping("/header")
    public String header(@RequestHeader("Accept") String[] accepts,
                         @RequestHeader(value = "Host", required = false, defaultValue = "hah") String host) {
        return Arrays.toString(accepts) + " Host:" + host;
    }

    @RequestMapping("/cookie")
    public String cookie(@CookieValue("hah") String hahValue,
                         @CookieValue(value = "JSESSIONID", required = false, defaultValue = "kjfkdji11111") String sessionId) {
        return "我的cookie里是有东西的：" + hahValue + " 还有：" + sessionId;
    }
}
