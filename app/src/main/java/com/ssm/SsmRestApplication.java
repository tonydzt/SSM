package com.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dzt
 * @date 17/10/26
 * Hope you know what you have done
 */
@SpringBootApplication
@MapperScan("com.ssm.mapper")
public class SsmRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsmRestApplication.class, args);
    }
}
