package com.crc.shardingjdbclearn.controller;


import com.crc.shardingjdbclearn.base.BaseController;
import com.crc.shardingjdbclearn.domain.UserDomain;
import com.crc.shardingjdbclearn.service.UserService;
import io.shardingsphere.core.keygen.DefaultKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @Author: chenrencun
 * @Date: 2019/8/12 14:04
 * @Description: user接口类
 */
@RestController
@RequestMapping("/user")
public class userController extends BaseController {

    @Autowired
    private UserService userService;

    DefaultKeyGenerator idWork = new DefaultKeyGenerator();

    @RequestMapping("/findUserList")
    public List<UserDomain> findUserList() {
        return userService.findUsers();
    }

    @RequestMapping("/addUsers")
    public String addUsers() {
        List<UserDomain> users = new ArrayList<>();
        int length = 10000;
        for (int i=1; i <= length; i++) {
            UserDomain userDomain = new UserDomain();
//            String uuId = UUID.randomUUID().toString().replace("-", "").toUpperCase();
            userDomain.setId(idWork.generateKey().longValue());
            userDomain.setUserName(String.valueOf(i));
            userDomain.setNick(String.valueOf(i));
            userDomain.setPassword("11111111");
            userDomain.setCreateDate(new Date());
            userDomain.setCreateUser("crc");
            users.add(userDomain);
            // 一条一条插入
//            userService.addUser(userDomain);
        }
        // 批量插入
        userService.addUsers(users);
        return "add success";
    }

    @RequestMapping("/findUsersByType")
    public List<UserDomain> findUsersByType(Integer type) {
        return userService.findUsersByType(type);
    }

    @RequestMapping("/deleteUsers")
    public String deleteUsers() {
        userService.deleteUsers();
        return "delete success";
    }


}
