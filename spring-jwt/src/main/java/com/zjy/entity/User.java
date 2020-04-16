package com.zjy.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    /**
     * 用户表
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 账号
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * 密码
     *
     * @mbggenerated
     */
    private String password;


}