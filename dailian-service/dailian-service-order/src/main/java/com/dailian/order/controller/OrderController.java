package com.dailian.order.controller;

import com.alibaba.fastjson.JSONObject;
import com.dailian.order.service.OrderService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package_Name: com.dailian.order.controller
 * @NAME: OrderController
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:34
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired(required = false)
    private OrderService orderService;

    @GetMapping("/findAll")
    public Result<String> findAll(){
        return new Result<>(true, StatusCode.OK,"成功", JSONObject.toJSONString(orderService.findAll()));
    }

}
