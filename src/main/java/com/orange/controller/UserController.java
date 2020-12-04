package com.orange.controller;

import com.orange.entity.User;
import com.orange.entity.UserResult;
import com.orange.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Orange
 * @create 2020-11-18 19:49
 */
@Controller
@RequestMapping("/user")
@Api(tags = {"用户管理"})
public class UserController {

    @Autowired
    private UserService userService;

    private int pageSize = 5;

    @PostMapping("/login") // 映射名为login的接口
    @ResponseBody // 响应数据为json格式
    @ApiOperation("用户登录") // swagger2 中该接口的注释
    public UserResult findByName(@RequestParam(name = "username", required = true)String username,
            @RequestParam(name = "password", required = true)String password) {
        UserResult result = new UserResult();
        User byName = userService.findByName(username);
        if (byName == null) {
            result.setCode(400);
            result.setMessage("用户名不存在！");
            result.setToken("");
        } else {
            if (password.equals(byName.getPassword())) {
                result.setCode(200);
                String token = UUID.randomUUID() + "";
                result.setToken(token);
                result.setMessage("登录成功！");
                Map<String, Object> map = new HashMap<>();
                map.put("id", byName.getId());
                map.put("username", username);
                result.setExtend(map);
            } else {
                result.setCode(400);
                result.setMessage("密码错误！");
                result.setToken("");
            }

        }
        return result;
    }

}
