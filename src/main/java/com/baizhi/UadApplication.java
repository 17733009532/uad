package com.baizhi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.baihi.dao")
public class UadApplication {
    public static void main(String[] args) {
        SpringApplication.run(UadApplication.class, args);
    }

}
