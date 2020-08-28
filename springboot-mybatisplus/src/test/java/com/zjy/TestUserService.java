package com.zjy;

import com.zjy.entity.UserEntity;
import com.zjy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Date 2020-08-28 10:32
 * @Created by zjy  多数据源配置测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Autowired
    private UserService userService;


    @Test //读
    public void findAll(){
        List<UserEntity> all = userService.findAll();
        all.forEach(s -> System.out.println(s));
    }

    @Test
    public void insert(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("uiouio").setGender(1).setPhone("66666666");
        userService.save(userEntity);
    }
}
