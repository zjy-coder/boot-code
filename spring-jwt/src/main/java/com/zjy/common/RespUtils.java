package com.zjy.common;

import com.github.pagehelper.Page;

/**
 * @Date 2020/3/26 14:39
 * @Created by zjy
 * 封装返回类
 */
public class RespUtils {
    /**
     * success 无对象返回
     * @return
     */
    public static Resp success(){
        Resp resp =new Resp();
        resp.setCode("000");
        resp.setMsg("成功");
        return resp;
    }
    /**
     * success 返回单个对象
     * @param data
     * @return
     */
    public static Resp success(Object data){
        Resp resp =new Resp();
        resp.setCode("000");
        resp.setMsg("成功");
        resp.setData(data);
        return resp;
    }

    /**
     * fail 返回失败信息
     * @return
     */
    public static Resp fail(){
        Resp resp =new Resp();
        resp.setCode("-1");
        resp.setMsg("失败");
        return resp;
    }

    /**
     * 返回pageHelper的数据以及list
     * @param pageObjcet
     * @param list
     * @return
     */
    public static Resp success(Object pageObjcet, Object list){
        PageResultVO pageResultVO = new PageResultVO();
        pageResultVO.setPages(((Page)pageObjcet).getPages());
        pageResultVO.setCurrent(((Page)pageObjcet).getPageNum());
        pageResultVO.setTotal(((Page)pageObjcet).getTotal());
        pageResultVO.setList(list);
        return success(pageResultVO);
    }
}
