package com.welcome.springmvcannotation.exception;

/**
 * 系统运行时异常
 *
 * @author yzx
 * @Date: 2018/7/27 14:54
 */
public class SysRuntimeException extends RuntimeException {

    private static final long serialVersionUID = -9069340218674808414L;
    //状态码
    private String code;

    public SysRuntimeException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
