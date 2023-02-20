package com.example.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.springbootdemo.bean.user;
import javafx.application.Application;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

public interface userService extends IService<user> {

     void listener(ApplicationEvent event);
}
