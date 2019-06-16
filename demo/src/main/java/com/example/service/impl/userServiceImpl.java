package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.service.userService;

/**
 * @author lih@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/6/16 11:07
 */
@Service
public class userServiceImpl implements userService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User user){
        return userMapper.insert(user);
    }
}
