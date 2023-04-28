package com.zyk.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.StringUtils;

import java.util.LinkedHashSet;

/**
 * @author zhangyongkai
 * @date 2023/4/24 16:15
 */
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    public static void main(String[] args) {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("1");
        strings.add("2");
        String[] strings1 = StringUtils.toStringArray(strings);
        UserServiceImpl userService = new UserServiceImpl();
        userService.say(strings1);
    }

    public void say(String ...args){
        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
