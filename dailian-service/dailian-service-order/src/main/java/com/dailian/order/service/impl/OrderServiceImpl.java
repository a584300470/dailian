package com.dailian.order.service.impl;

import com.dailian.order.dao.UserMapper;
import com.dailian.order.pojo.Order;
import com.dailian.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Package_Name: com.dailian.order.service.impl
 * @NAME: OrderServiceImpl
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:33
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Order> findAll() {
        return userMapper.selectAll();
    }
}
