package com.zyk.auth.service;

import com.zyk.auth.entity.SysUser;

/**
 * @author zhangyongkai
 * @date 2023/4/18 15:54
 */
public interface IAuthService {

    /**
     * 获取token
     * @param sysUser
     * @return
     */
    public String getToken(SysUser sysUser);

    public String refreshToken(String token);

}
