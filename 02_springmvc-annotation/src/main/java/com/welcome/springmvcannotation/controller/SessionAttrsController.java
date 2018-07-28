package com.welcome.springmvcannotation.controller;

import com.welcome.springmvcannotation.base.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * SessionAttributes注解示例
 *
 * @author yzx
 * @Date: 2018/7/28 16:44
 */
@Controller
@SessionAttributes("user")
@RequestMapping("/sessionAttrs")
public class SessionAttrsController {
    @RequestMapping("/getUserPage/{name}")
    public String getUserPage(@PathVariable("name") String name, Model model) {
        User user = new User();
        user.setName(name);
        user.setAge(18);
        model.addAttribute("user", user);
        return "userPage.html";
    }
}
