package com.xuecheng.content;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author jack
 * @date 2024/4/20
 * @since 0.0.1-SNAPSHOT
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xuecheng.content.mapper.**")
public class ContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class, args);
    }

}
