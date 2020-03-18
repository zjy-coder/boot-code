package com.zjy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = {"com.zjy.mapper"})
public class JwtTokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtTokenApplication.class, args);
    }

}
