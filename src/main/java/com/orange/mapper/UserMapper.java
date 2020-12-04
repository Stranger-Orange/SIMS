package com.orange.mapper;

import com.orange.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author Orange
 * @create 2020-11-18 20:20
 */
public interface UserMapper {

    /**
     * 通过用户名验证密码
     * @param username
     * @return
     */
    User findByName(String username);

}
