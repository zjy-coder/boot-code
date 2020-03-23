package com.zjy.bootmybatis.controller;

import com.zjy.bootmybatis.mapper.TestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test")
    public Object getTest(HttpServletRequest request){
        log.info("进入方法,url-->{}",request.getRequestURI());
        return testMapper.selectByPrimaryKey(5);
    }
}
