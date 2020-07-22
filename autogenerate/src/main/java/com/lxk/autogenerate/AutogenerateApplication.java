package com.lxk.autogenerate;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lxk.autogenerate.mapper")
@EnableSwagger2Doc
public class AutogenerateApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutogenerateApplication.class, args);
    }

}
