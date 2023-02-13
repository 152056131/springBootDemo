package com.example.springbootdemo.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdemo.bean.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface mpLoginMapper extends BaseMapper<user>{
}
