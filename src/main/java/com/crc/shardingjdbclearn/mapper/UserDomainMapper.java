package com.crc.shardingjdbclearn.mapper;

import com.crc.shardingjdbclearn.domain.UserDomain;
import com.crc.shardingjdbclearn.vo.UserVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: chenrencun
 * @Date: 2019/8/12 11:16
 * @Description: 描述
 */
@Repository
public interface UserDomainMapper {

    List<UserDomain> findUsers();

    void addUser(UserDomain userDomain);

    void addUsers(@Param("userList") List<UserDomain> userList);

    List<UserDomain> findUsersByType(@Param("type") Integer type);

    void deleteUsers();





}
