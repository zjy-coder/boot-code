package com.zjy.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageResultVO<T> implements Serializable {

    /* 页数 */
    private Integer pages = 0;

    /* 当前页 */
    private Integer current = 0;

    /* 总条数 */
    private Long total = (long) 0;

    /* 返回具体的内容 */
    private T list;
}