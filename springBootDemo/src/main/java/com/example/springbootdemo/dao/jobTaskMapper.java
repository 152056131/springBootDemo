package com.example.springbootdemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springbootdemo.bean.jobTask;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface jobTaskMapper extends BaseMapper<jobTask> {
}
