package com.dailian.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Package_Name: com.dailian.order
 * @NAME: OrderApplication
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:36
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.dailian.order.dao"})
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }
}
