package com.zjy.controller;

import com.zjy.utils.Result;
import com.zjy.utils.ResultUtil;
import com.zjy.utils.StatusCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public Result hello(){
        return ResultUtil.success(StatusCode.Success);
    }
}
