package com.zjy.utils;

import lombok.Data;

import java.io.Serializable;

/**
 * 普通返回结果
 * @param <T>
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -8630858531126402157L;

    /* 错误码 */
    private Integer code;

    /* 错误信息 */
    private String msg;

    /* 返回具体的内容 */
    private T data;
}