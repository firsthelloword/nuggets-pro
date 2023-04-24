package com.zyk.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangyongkai
 * @date 2023/4/16 18:51
 */
@SpringBootApplication(scanBasePackages = "com.zyk")
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
