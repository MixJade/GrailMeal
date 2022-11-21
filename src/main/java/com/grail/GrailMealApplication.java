package com.grail;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class GrailMealApplication {
    private static final Logger log = LoggerFactory.getLogger(GrailMealApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GrailMealApplication.class, args);
        log.info("赤杯餐饮启动,登录地址:http://localhost:8080/");
    }
}
