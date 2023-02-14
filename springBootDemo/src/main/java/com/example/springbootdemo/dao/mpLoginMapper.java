package com.example.springbootdemo.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.springbootdemo.bean.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface mpLoginMapper extends BaseMapper<user>{
    IPage<user> getUserPage (IPage<user> page, @Param("username") String username);
}
