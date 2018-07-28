package com.welcome.springmvcannotation.base.handler;

import com.welcome.springmvcannotation.base.exception.SysBusinessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 全局异常处理
 *
 * @author yzx
 * @Date: 2018/7/27 17:12
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SysBusinessException.class)
    @ResponseBody
    public Object sysBusinessExceptionHandler(SysBusinessException e){
        return "系统业务异常:"+e.getMessage();
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object exceptionHandler(Exception e){
        return "系统未知错误，请联系管理员！";
    }
}
