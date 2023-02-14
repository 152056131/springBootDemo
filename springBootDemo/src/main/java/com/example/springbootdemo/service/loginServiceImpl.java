package com.example.springbootdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootdemo.bean.user;

import java.util.List;

public interface loginServiceImpl {
     List<user> login(String username, String password);
}
