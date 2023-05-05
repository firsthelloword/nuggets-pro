package com.zyk.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyk.auth.entity.SysUser;
import com.zyk.auth.mapper.SysUserMapper;
import com.zyk.auth.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author zhangyongkai
 * @date 2023/5/4 10:37
 */
public class AuthServiceImpl implements IAuthService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String getToken(SysUser sysUser) {

        String encodePassword = passwordEncoder.encode(sysUser.getPassword());

        QueryWrapper<SysUser> sysUserQueryWrapper = new QueryWrapper<>();
        sysUserQueryWrapper.eq("username",sysUser.getUsername())
                        .eq("password",encodePassword);

        SysUser user = sysUserMapper.selectOne(sysUserQueryWrapper);
        return null;
    }


}
