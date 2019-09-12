package com.crc.shardingjdbclearn.service.impl;


import com.crc.shardingjdbclearn.domain.UserDomain;
import com.crc.shardingjdbclearn.mapper.UserDomainMapper;
import com.crc.shardingjdbclearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: chenrencun
 * @version：
 * @date: 2019/8/12 22:11
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDomainMapper userDomainMapper;

    @Override
    public List<UserDomain> findUsers() {
        return userDomainMapper.findUsers();
    }

    @Override
    public void addUser(UserDomain userDomain) {
        userDomainMapper.addUser(userDomain);
    }

    @Override
    public void addUsers(List<UserDomain> userList) {
        userDomainMapper.addUsers(userList);
    }

    @Override
    public List<UserDomain> findUsersByType(Integer type) {
        return userDomainMapper.findUsersByType(type);
    }

    @Override
    public void deleteUsers() {
        userDomainMapper.deleteUsers();
    }
}
