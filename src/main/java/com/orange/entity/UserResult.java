package com.orange.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Orange
 * @create 2020-11-18 20:51
 */
public class UserResult {

    // 返回的状态码
    private Integer code;
    // 返回的token令牌
    private String token;
    // 返回的处理消息
    private String message;
    // 返回的对象
    private Map<String, Object> extend = new HashMap<>();

    public UserResult() {
    }

    public UserResult(Integer code, String token, String message, Map<String, Object> extend) {
        this.code = code;
        this.token = token;
        this.message = message;
        this.extend = extend;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }
}
