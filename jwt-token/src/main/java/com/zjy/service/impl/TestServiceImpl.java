package com.zjy.service.impl;

import com.zjy.entity.TestEntity;
import com.zjy.entity.TypeListEntity;
import com.zjy.mapper.TestMapper;
import com.zjy.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;


    @Scheduled(fixedDelay = 1 * 1000)
    @Override
    public void add() {
        Random random = new Random();
        Integer num = random.nextInt(3)+1;
        testMapper.add(num);
    }

    public void select(){
        List<TypeListEntity> listEntities=testMapper.getType();
        List<TestEntity> list=testMapper.getResult(listEntities);
        list.forEach(System.out::println);
    }
}
