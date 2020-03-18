package com.zjy.controller;

import com.zjy.service.TestService;
import com.zjy.utils.Result;
import com.zjy.utils.ResultUtil;
import com.zjy.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private TestService testService;

    @GetMapping("/hello")
    public Result hello(){
        testService.select();
        return ResultUtil.success(StatusCode.Success);
    }

    public Result add(){
        testService.add();
        return ResultUtil.success(StatusCode.Success);
    }
}
