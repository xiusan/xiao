package com.lord.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("com.lord.mp.dao")
public class MpApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(MpApplication.class).run(args);
    }

}
