package com.welcome.springmvcannotation.controller;

import com.welcome.springmvcannotation.base.exception.SysBusinessException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/advice")
public class ThrowExceptionController {
    @RequestMapping("/throw")
    public String throwException() throws SysBusinessException {
        throw new SysBusinessException("出错了，出错了","error");
    }
}
