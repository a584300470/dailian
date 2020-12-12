package com.dailian.gameInfo.dao;

import com.dailian.gameinfo.pojo.GameInfo;
import tk.mybatis.mapper.annotation.RegisterMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Package_Name: com.dailian.gameInfo.dao
 * @NAME: GameInfoMapper
 * @Autohor：吴铭
 * @Date： 2020/12/12 23:11
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */


// 不需要加注解 只需要在启动类添加tk.mapper.的MapperScan注解,设置basePackages的值 -> Mapper的类路径地址
public interface GameInfoMapper extends Mapper<GameInfo> {

}
