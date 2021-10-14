package com.yuhan.bef.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SceneConfiguration {

    @Bean
    public SpringBeanLoader springBeanLoader() {
        return new SpringBeanLoader();
    }
}
