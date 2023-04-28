package com.zyk.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

/**
 * 资源服务器配置
 * @author zhangyongkai
 * @date 2023/4/24 15:42
 */

@EnableWebSecurity
@EnableWebFluxSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity) {
        httpSecurity
                .authorizeExchange().pathMatchers(HttpMethod.OPTIONS).permitAll()
                // 任何请求需要身份认证
                .pathMatchers("/**").permitAll().and()
                .csrf().disable();
        return httpSecurity.build();
    }


}
