package com.xjl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.xjl.*"})
public class SpringZufangApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZufangApplication.class, args);
	}

}
