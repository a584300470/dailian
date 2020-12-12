package com.dailian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Package_Name: com.dailian
 * @NAME: EurekaApplication
 * @Autohor：吴铭
 * @Date： 2020/12/12 19:18
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaApplication.class,args);

    }
}
