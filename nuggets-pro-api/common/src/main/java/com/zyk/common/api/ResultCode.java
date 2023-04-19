package com.zyk.common.api;


/**
 * 请求状态码
 * @author zhangyongkai
 * @date 2023/4/19 14:30
 */
public class ResultCode {

    /**
     * 成功
     */
    public static final long SUCCESS = 200;
    /**
     * 参数错误
     */
    public static final long PARAMS_ERROR = 400;
    /**
     * 系统错误
     */
    public static final long SYS_ERROR = 500;

    private ResultCode(){}

}
