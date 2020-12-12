package com.dailian.gameInfo.service;

import com.dailian.gameinfo.pojo.GameInfo;

import java.util.List;

/**
 * @Package_Name: com.dailian.gameInfo.service
 * @NAME: GameInfoService
 * @Autohor：吴铭
 * @Date： 2020/12/12 23:21
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
public interface GameInfoService {

    List<GameInfo> findAll();
}
