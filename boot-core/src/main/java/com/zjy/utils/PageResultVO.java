package com.zjy.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页返回基本结果
 * @param <T>
 */
@Data
public class PageResultVO<T> implements Serializable {

    private static final long serialVersionUID = -7435770030056838775L;

    /* 页数 */
    private Integer pages = 0;

    /* 当前页 */
    private Integer current = 0;

    /* 总条数 */
    private Long total = (long) 0;

    /* 返回具体的内容 */
    private T list;
}