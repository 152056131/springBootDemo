package com.example.springbootdemo.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.dao.loginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class loginService implements loginServiceImpl {

    @Resource
    private loginDao logindao;

    @Override
    public List<user> login(String username, String password) {
        return logindao.login(username, password);
    }



}
