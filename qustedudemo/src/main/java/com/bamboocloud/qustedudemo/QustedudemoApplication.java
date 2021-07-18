package com.bamboocloud.qustedudemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com/bamboocloud/qustedudemo/mapper")
public class QustedudemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QustedudemoApplication.class, args);
    }

}
