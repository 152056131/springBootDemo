package com.example.springbootdemo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface loginDao {
 @Select("SELECT username,password from user where username=#{username} and password=#{password}")
 String login(String username, String password);
}
//50098892
