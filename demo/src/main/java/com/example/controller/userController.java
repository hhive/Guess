package com.example.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.entity.User;
import com.example.service.userService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author lih@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/6/16 11:25
 */
@Slf4j
@Controller
@RequestMapping("/user")
@Transactional
public class userController {
    @Autowired
    private userService userService;

    @RequestMapping("/addUser")
    @ResponseBody
    public int addUser(String id, String name, String password) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setPassword(password);
        log.info("name:" + user.getName());
        return userService.addUser(user);
    }
}
