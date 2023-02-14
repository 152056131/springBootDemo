package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.user;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface loginDao {
 @Select("SELECT username,password from user where username=#{username} and password=#{password}")
 List<user> login(String username, String password);
}
