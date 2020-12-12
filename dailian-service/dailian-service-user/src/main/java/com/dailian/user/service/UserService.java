package com.dailian.user.service;

import com.dailian.user.pojo.User;

import java.util.List;

/**
 * @Package_Name: com.dailian.user.service
 * @NAME: UserService
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:21
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
public interface UserService {

    List<User> findAll();

    void save(User user);
}
