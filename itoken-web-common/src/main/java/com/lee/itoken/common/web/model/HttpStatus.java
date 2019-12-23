package com.lee.itoken.common.web.model;

/**
 * @author lee
 * @date 2019/7/24 9:43
 * @description
 */
public enum HttpStatus {
    /**
     * 触发熔断器的响应
     */
    BAD_GATEWAY(502, "从上游服务器无法接收到响应");

    private int code;
    private String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
