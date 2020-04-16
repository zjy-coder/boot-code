package com.zjy.common;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Date 2020/3/26 14:35
 * @Created by zjy
 * 返回基类
 */
@Data
@Slf4j
public class Resp<T> {
    private String code; //响应码
    private String msg; //响应结果
    private T data; //响应数据
}
