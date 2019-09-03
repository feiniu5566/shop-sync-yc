package com.sy.yc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sy.yc.dao")
public class ShopSyncYcApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopSyncYcApplication.class, args);
    }

}
