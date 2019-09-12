package com.crc.shardingjdbclearn.service;


import com.crc.shardingjdbclearn.domain.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: chenrencun
 * @version：
 * @date: 2019/8/12 22:11
 **/
public interface UserService {

    List<UserDomain> findUsers();

    void addUser(UserDomain userDomain);

    void addUsers(List<UserDomain> userList);

    List<UserDomain> findUsersByType(@Param("type") Integer type);

    void deleteUsers();


}
