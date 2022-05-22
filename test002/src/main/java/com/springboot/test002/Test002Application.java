package com.springboot.test002;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.test002.mapper")
public class Test002Application {

    public static void main(String[] args) {
        SpringApplication.run(Test002Application.class, args);
    }

}
