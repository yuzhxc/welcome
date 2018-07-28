package com.welcome.springmvcannotation.exception;

/**
 * 系统业务异常
 *
 * @author yzx
 * @Date: 2018/7/27 15:02
 */
public class SysBusinessException extends Exception {

    private static final long serialVersionUID = 5453877939091815998L;
    // 状态码
    private String code;

    public SysBusinessException(String message, String code) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
