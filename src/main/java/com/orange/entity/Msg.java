package com.orange.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Orange
 * @create 2020-11-18 20:53
 */
public class Msg {

    // 状态码
    private int code;
    // 返回信息
    private String message;
    // 响应数据中的对象
    private Map<String, Object> extend = new HashMap<>();

    public Msg() {
    }

    public Msg(Integer code, String message, Map<String, Object> extend) {
        this.code = code;
        this.message = message;
        this.extend = extend;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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
