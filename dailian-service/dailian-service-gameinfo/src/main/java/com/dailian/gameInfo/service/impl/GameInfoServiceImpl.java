package com.dailian.gameInfo.service.impl;

import com.dailian.gameInfo.dao.GameInfoMapper;
import com.dailian.gameInfo.service.GameInfoService;
import com.dailian.gameinfo.pojo.GameInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package_Name: com.dailian.gameInfo.service.impl
 * @NAME: GameInfoServiceImpl
 * @Autohor：吴铭
 * @Date： 2020/12/12 23:23
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@Service
public class GameInfoServiceImpl implements GameInfoService {

    @Autowired(required = false)
    private GameInfoMapper gameInfoMapper;


    @Override
    public List<GameInfo> findAll() {
        return gameInfoMapper.selectAll();
    }
}
