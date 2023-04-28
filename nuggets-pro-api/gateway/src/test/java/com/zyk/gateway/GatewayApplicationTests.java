package com.zyk.gateway;

import com.zyk.gateway.config.IgnoreUrlConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GatewayApplicationTests {

    @Autowired
    private IgnoreUrlConfig ignoreUrlConfig;
    @Test
    void contextLoads() {
        List<String> urls = ignoreUrlConfig.getUrls();
        System.out.println(urls);
    }

}
