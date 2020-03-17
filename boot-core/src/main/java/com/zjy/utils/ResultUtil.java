package com.zjy.utils;

import com.github.pagehelper.Page;


/**
 * 返回结果工具
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
    public static Result error(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.setCode(-1);
        result.setMsg(msg);
        return result;
    }

    public static Result error(StatusCode code){
        Result result = new Result();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        return result;
    }


    public static Result success (StatusCode code){
        Result result = new Result();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        return result;
    }

    public static Result success(Object pageObjcet, Object list){
        PageResultVO pageResultVO = new PageResultVO();
        pageResultVO.setPages(((Page)pageObjcet).getPages());
        pageResultVO.setCurrent(((Page)pageObjcet).getPageNum());
        pageResultVO.setTotal(((Page)pageObjcet).getTotal());
        pageResultVO.setList(list);
        return success(pageResultVO);
    }


    public static Result success(StatusCode code, Object data){
        Result result = new Result();
        result.setCode(code.getCode());
        result.setData(data);
        return result;
    }
}
