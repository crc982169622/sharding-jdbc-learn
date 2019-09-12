package com.crc.shardingjdbclearn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.crc.shardingjdbclearn.mapper")
public class ShardingJdbcLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcLearnApplication.class, args);
    }

}
