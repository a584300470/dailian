package com.dailian.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.dailian.user.pojo.User;
import com.dailian.user.service.UserService;
import entity.Result;
import entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Package_Name: com.dailian.user.controller
 * @NAME: UserController
 * @Autohor：吴铭
 * @Date： 2020/12/13 0:22
 * @Project_Name: MapleStoryTW-DaiLian-parent
 */

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    // 查找

    // 查找全部
    @GetMapping("/findAll")
    public Result<String> findAll(){
        return new Result<>(true, StatusCode.OK,"查找全部用户成功", JSONObject.toJSONString(userService.findAll()));
    }

    // 条件查找

    // 关键字查找分页

    // 多条件搜索

    // 多条件搜索分页

    // 用户增删改查

    // 新增/修改
    @PostMapping("/save")
    public Result save(User user){
        userService.save(user);
        return new Result(true,StatusCode.OK,"保存用户信息成功","");
    }

}
