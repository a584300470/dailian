package com.dailian.order.service;

import com.dailian.order.pojo.Order;

import java.util.List;

/**
 * @Package_Name: com.dailian.order.service
 * @NAME: OrderService
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:32
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */
public interface OrderService {

    List<Order> findAll();

}
