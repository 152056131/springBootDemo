package com.example.springbootdemo.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.dao.mpLoginMapper;
import com.example.springbootdemo.service.loginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@Api("登录测试")
@Slf4j
@RequiredArgsConstructor
public class loginController {

    @Autowired
    private loginService loginservice;
    @Autowired
    private mpLoginMapper mp;
    @Autowired
    RabbitTemplate rabbitTemplate;

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

    @ApiOperation("查询案例测试")
    @GetMapping(value = "mpquery")
    public List mpquery(String username, String password) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("username", username);
        wrapper.eq("password", password);
        log.info("info:" + username);
        return mp.selectList(wrapper);
    }

    @ApiOperation("分页案例测试")
    @GetMapping(value = "mpipage")
    public Page<user> mpipage(int pageNum, int pageSize) {
        Page<user> page = new Page<>(pageNum, pageSize);
        QueryWrapper<user> queryWrapper = new QueryWrapper<>();
        return mp.selectPage(page, queryWrapper);

    }

    @ApiOperation("登录测试案例")
    @GetMapping(value = "/hello")
    public List<user> test() {
        String username = "ysk";
        String password = "123456";
        log.info("info" + username);
        log.debug("debug" + password);
        log.error("error" + username);
        return loginservice.login(username, password);
    }



    /**
     * rabbitmq发送消息
     */
    @ApiOperation("rabbitmq案例")
    @GetMapping(value = "sendrabbit")
    public String sendMsg(){
        String messageId = String.valueOf(UUID.randomUUID());
        String messageData = "test message, hello!";
        String createTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        Map<String,Object> map=new HashMap<>();
        map.put("messageId",messageId);
        map.put("messageData",messageData);
        map.put("createTime",createTime);
        //将消息携带绑定键值：TestDirectRouting 发送到交换机TestDirectExchange
        rabbitTemplate.convertAndSend("TestDirectExchange", "TestDirectRouting", map);
        return "ok";
    }
}
