package com.example.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.dao.mpLoginMapper;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class userServiceImp extends ServiceImpl<mpLoginMapper, user> implements userService{
    @Override
    @EventListener(classes = ApplicationEvent.class)
    public void listener(ApplicationEvent event) {
        System.out.println("事件监听到："+event.toString());
    }
}
