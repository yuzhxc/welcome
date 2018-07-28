package com.welcome.springmvcannotation.controller;


import com.welcome.springmvcannotation.base.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/new")
public class NewRestController {

    @RequestMapping("/getUserJson")
    public User getUserJson() {
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        return user;
    }
}
