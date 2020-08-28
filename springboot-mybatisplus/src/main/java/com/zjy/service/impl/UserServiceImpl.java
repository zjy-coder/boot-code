package com.zjy.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.zjy.entity.UserEntity;
import com.zjy.mapper.UserMapper;
import com.zjy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Date 2020-08-28 10:28
 * @Created by zjy  测试多数据源
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @DS("slave_1")//指定读的数据库
    @Override //读
    public List<UserEntity> findAll() {
        return userMapper.selectList(null);
    }


    @DS("master")//指定写的数据库
    @Override //写
    public void save(UserEntity userEntity) {
        userMapper.insert(userEntity);
    }
}
