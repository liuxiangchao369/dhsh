package com.game.dhsh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author liuxiangchao
 */
@SpringBootApplication
@MapperScan("com.game.dhsh.mapper.*")
public class DhshApplication {
    public static void main(String[] args) {
        SpringApplication.run(DhshApplication.class, args);
    }

}
