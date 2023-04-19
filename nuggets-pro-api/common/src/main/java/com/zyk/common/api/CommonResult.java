package com.zyk.common.api;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhangyongkai
 * @date 2023/4/19 14:30
 */
@Getter
@Setter
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    CommonResult(long code,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
    CommonResult(long code,String message){
        this.code = code;
        this.message = message;
    }


    public static <T> CommonResult<T> success(T t){
        return new CommonResult<>(ResultCode.SUCCESS, "请求成功", t);
    }

    public static <T> CommonResult<T> paramsError(){
        return  new CommonResult<>(ResultCode.PARAMS_ERROR, "参数错误", null);
    }

    public static <T> CommonResult<T> systemError(){
        return  new CommonResult<>(ResultCode.SYS_ERROR, "系统内部错误", null);
    }
    public static <T> CommonResult<T> systemError(String message){
        return  new CommonResult<>(ResultCode.SYS_ERROR, message, null);
    }
}
