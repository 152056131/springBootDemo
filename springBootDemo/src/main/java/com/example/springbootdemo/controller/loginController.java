package com.example.springbootdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.dao.mpLoginMapper;
import com.example.springbootdemo.service.loginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

@RestController
@Api("登录测试")
public class loginController {

    @Autowired
    private loginService loginservice;
    @Autowired
    private mpLoginMapper mp;

    @ApiOperation("添加测试案例")
    @GetMapping(value = "/mpinsert")
    public int mpinsert() {
        user user = new user();
        user.setUsername("ysk");
        user.setPassword("123");
        int count = mp.insert(user);
        return count;
    }

    @ApiOperation("删除案例测试")
    @GetMapping(value = "/mpdel")
    public int mpdel() {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", "kevin");
        int count = mp.delete(wrapper);
        return count;
    }

    @ApiOperation("修改案例测试")
    @GetMapping(value = "mpupdate")
    public int mpupdate() {
        UpdateWrapper wrapper = new UpdateWrapper();
        wrapper.set("password", "456");
        wrapper.eq("username", "abc");
        int count = mp.update(null, wrapper);
        return count;
    }

    @ApiOperation("登录测试案例")
    @GetMapping(value = "/hello")
    public String test() {
        return loginservice.login("abc", "123");
    }
}
