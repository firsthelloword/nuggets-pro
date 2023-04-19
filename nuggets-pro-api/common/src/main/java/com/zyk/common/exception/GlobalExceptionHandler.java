package com.zyk.common.exception;

import com.zyk.common.api.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @author zhangyongkai
 * @date 2023/4/19 14:26
 */
@RestControllerAdvice
public class GlobalExceptionHandler{


    /**
     * 全局处理sql异常
     * @return 通用返回结果
     */
    @ExceptionHandler(SQLException.class)
    public CommonResult<Object> sqlExceptionHandler(){
        return CommonResult.systemError("数据库异常");
    }

    @ExceptionHandler(NullPointerException.class)
    public CommonResult<Object> nullExceptionHandler(){
        return CommonResult.systemError("空指针异常");
    }



}
