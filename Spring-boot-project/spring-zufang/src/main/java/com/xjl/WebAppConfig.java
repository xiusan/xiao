package com.xjl;

import com.xjl.aop.AuthInterceptor;
import com.xjl.aop.SysAuthInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * spring mvc配置
 *
 * @author lvyimeng
 * @date 2019/4/22 15:51
 */
@EnableWebMvc
@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(WebAppConfig.class);
    @Bean
    public HandlerInterceptor getAuthInterceptor() {
        return new AuthInterceptor();
    }

    @Bean
    public HandlerInterceptor getSysAuthInterceptor() {
        return new SysAuthInterceptor();
    }
    /**
     * 拦截器配置
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        logger.info("------拦截器配置开始------");
/*        registry.addInterceptor(getAuthInterceptor()).addPathPatterns("/api*//**");*/
        registry.addInterceptor(getSysAuthInterceptor()).addPathPatterns("/*");

        logger.info("------拦截器配置结束------");
    }

}
