package com.xjl.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: xiaojinlu1990@163.com
 * @Date: 2020/5/31 12:39
 * @Description:
 */
@Configuration
public class ConfigUtils {
    @Bean
    public ModelMapper modelMapper() {
        final ModelMapper modelMapper = new ModelMapper();
        /**
         * 完全匹配
         */
        modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
        /**
         * 匹配策略定义为严格
         */
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
}
