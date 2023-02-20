package com.example.springbootdemo.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springbootdemo.bean.jobTask;
import com.example.springbootdemo.dao.jobTaskMapper;
import org.springframework.stereotype.Service;


@Service
public class jobTaskServiceImp extends ServiceImpl<jobTaskMapper, jobTask> implements jobTaskService {

}
