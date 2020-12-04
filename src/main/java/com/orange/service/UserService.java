package com.orange.service;

import com.orange.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Orange
 * @create 2020-11-18 20:29
 */
public interface UserService {

    /**
     * 通过用户名验证密码
     * @param username
     * @return
     */
    User findByName(String username);
}
