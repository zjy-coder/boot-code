package com.zjy.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class TestEntity implements Serializable {
    private Integer id;
    private String name;
    private Integer type;
    private Date createTime;
}
