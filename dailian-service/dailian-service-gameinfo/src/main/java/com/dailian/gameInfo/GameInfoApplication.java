package com.dailian.gameInfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Package_Name: com.dailian.gameInfo
 * @NAME: GameInfoApplication
 * @Autohor：吴铭
 * @Date： 2020/12/12 21:07
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.dailian.gameInfo.dao"})
public class GameInfoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameInfoApplication.class,args);
    }
}
