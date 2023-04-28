package com.zyk.gateway.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * 白名单url
 * @author zhangyongkai
 * @date 2023/4/24 17:05
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "ignore")
public class IgnoreUrlConfig {

    private List<String> urls;

}
