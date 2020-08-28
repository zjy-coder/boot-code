package com.zjy;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjy.entity.UserEntity;
import com.zjy.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootMybatisplusApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test//查询所有
    public void findAll(){
        List<UserEntity> userEntities = userMapper.selectList(null);
        userEntities.forEach( userEntity -> System.out.println(userEntity));
    }

    @Test//查询单个
    public void findById(){
        UserEntity userEntity = userMapper.selectById("1");
        System.out.println(userEntity);
    }

    @Test//条件查询
    public void  find (){
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper();
        queryWrapper.eq("phone", "13244989430");
        queryWrapper.eq("gender", 0);
        List<UserEntity> userEntities = userMapper.selectList(queryWrapper);
        userEntities.forEach( userEntity -> System.out.println(userEntity));
    }

    @Test//新增
    public void save(){
        UserEntity entity = new UserEntity();
        entity.setName("qwe").setGender(1);
        int insert = userMapper.insert(entity);
        log.info("insert num:{}", insert);
    }

    @Test
    public void update(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("修改");
        QueryWrapper<UserEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name", "qwe");
        int update = userMapper.update(userEntity, queryWrapper);
        log.info("update num:{}", update);
    }

    @Test
    public void findPage(){
        IPage<UserEntity> page = new Page<>(2,2);
        IPage<UserEntity> userEntityIPage = userMapper.selectPage(page, null);
        log.info("总条数：{}", userEntityIPage.getTotal());
        userEntityIPage.getRecords().forEach(userEntity -> System.out.println(userEntity));

    }
}
