package com.example.springbootdemo.service;

import com.example.springbootdemo.dao.loginDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class loginService implements loginServiceImpl {

    @Resource
    private loginDao logindao;

    @Override
    public String login(String username, String password) {
        return logindao.login(username, password);
    }
}
