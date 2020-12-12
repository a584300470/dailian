package com.dailian.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Package_Name: com.dailian.user
 * @NAME: UserApplication
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:45
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.dailian.user.dao"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }

}
