package com.welcome.springmvcannotation.controller;

import com.welcome.springmvcannotation.base.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/traditional")
public class TraditionalController {

    @GetMapping("/getUser")
    public User getUser(){
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        return user;
    }
    @GetMapping("/getUserJson")
    @ResponseBody
    public User getUserJson(){
        User user = new User();
        user.setName("小明");
        user.setAge(18);
        return user;
    }
    @RequestMapping("/getUserPage")
    public String getUserPage(Model model){

        User user = new User();
        user.setName("小明");
        user.setAge(18);
        model.addAttribute("user",user);
        return "userPage.html";
    }
}
