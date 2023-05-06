package com.zyk.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zyk.auth.entity.SysUser;
import com.zyk.auth.mapper.SysUserMapper;
import com.zyk.auth.service.IAuthService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author zhangyongkai
 * @date 2023/5/4 10:37
 */
@Service
@ConfigurationProperties("jwt.config")
public class AuthServiceImpl implements IAuthService {

    private Long expire;

    private String secret;




    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String getToken(SysUser sysUser) {


        Date expireDate = new Date(System.currentTimeMillis() + 1000 * expire);

        return Jwts.builder()
                .setHeaderParam("typ", "JWT")
                .setSubject(sysUser.getUsername())
                .setIssuedAt(new Date())
                .setExpiration(expireDate)    // 7天过期
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
    }

    @Override
    public String refreshToken(String token) {
        return null;
    }


}
