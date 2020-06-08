package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gmall.demo.gmalldb.mapper")
public class GmallDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallDbApplication.class, args);
    }
}
