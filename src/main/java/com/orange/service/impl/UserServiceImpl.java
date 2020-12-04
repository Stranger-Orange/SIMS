package com.orange.service.impl;

import com.orange.entity.User;
import com.orange.mapper.UserMapper;
import com.orange.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Orange
 * @create 2020-11-18 20:30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String username) {
        return userMapper.findByName(username);
    }
}
