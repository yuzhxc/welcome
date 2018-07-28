package com.welcome.springmvcannotation.controller;

import com.welcome.springmvcannotation.base.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 转换注解讲解
 *
 * @author yzx
 * @Date: 2018/7/28 17:28
 */
@RestController
@RequestMapping("/conversion")
public class ConversionController {
    @RequestMapping("/getUser")
    public String getUser(@RequestBody User user) {
        return "我成功被转了：" + user.getName();
    }
}
