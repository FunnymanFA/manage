package com.smart.zrf.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author ZRF
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.smart.zrf.manage.mapper")
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }

}
