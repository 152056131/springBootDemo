package com.example.springbootdemo.common.service.impl;

import com.example.springbootdemo.common.entity.User;
import com.example.springbootdemo.common.mapper.UserMapper;
import com.example.springbootdemo.common.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author kevin
 * @since 2023-02-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
