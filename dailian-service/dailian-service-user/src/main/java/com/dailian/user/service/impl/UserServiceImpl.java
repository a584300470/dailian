package com.dailian.user.service.impl;

import com.dailian.user.dao.UserMapper;
import com.dailian.user.pojo.User;
import com.dailian.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package_Name: com.dailian.user.service.impl
 * @NAME: UserServiceImpl
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:21
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public void save(User user) {
        userMapper.insertSelective(user);
    }


}
