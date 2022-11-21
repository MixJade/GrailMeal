package com.grail;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GrailMealApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrailMealApplication.class, args);
        log.info("赤杯餐饮启动,登录地址:http://localhost:8080/");
    }
}
