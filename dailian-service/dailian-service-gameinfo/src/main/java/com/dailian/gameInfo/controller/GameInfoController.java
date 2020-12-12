package com.dailian.gameInfo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dailian.gameInfo.service.GameInfoService;
import com.dailian.gameinfo.pojo.GameInfo;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package_Name: com.dailian.gameInfo.controller
 * @NAME: GameInfoController
 * @Autohor：吴铭
 * @Date： 2020/12/12 23:20
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@RestController
@RequestMapping("/GameInfo")
@CrossOrigin
public class GameInfoController {

    @Autowired(required = false)
    private GameInfoService gameInfoService;

    @GetMapping("/findAll")
    public Result<String> findAll(){
        List<GameInfo> gameInfoList = gameInfoService.findAll();
        //return new Result<>(true,20000, "查询所有游戏属性成功",JSON.toJSONString(gameInfoList));
        return new Result<>(true,20000, "查询所有游戏属性成功",JSONObject.toJSONString(gameInfoList));
    }



}
