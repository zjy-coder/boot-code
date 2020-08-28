package com.zjy.service;

import com.zjy.entity.UserEntity;

import java.util.List;

/**
 * @Date 2020-08-28 10:28
 * @Created by zjy
 */
public interface UserService {

    List<UserEntity> findAll();

    void save(UserEntity userEntity);
}
