package com.yj.yj_java1.service.impl;

import com.yj.yj_java1.entity.User;
import com.yj.yj_java1.mapper.UserMapper;
import com.yj.yj_java1.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import javax.naming.Name;
import java.rmi.Naming;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User GetUserInfo() {
        User userInfo = new User();
        userInfo.setName("张三");
        userInfo.setPassword(213);
        return userInfo;
    }

    @Override
    public void addUserInfo() {
        String username = "jack";
        int password = 123;
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        userMapper.addUserInfo(user);
    }
}
