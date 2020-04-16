package com.zjy.service;

import com.zjy.entity.User;
import com.zjy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Date 2020/4/7 14:28
 * @Created by zjy
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User findByUsername(User user){
        return userMapper.findByUsername(user.getUserName());
    }
    public User findUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}
