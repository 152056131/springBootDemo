package com.example.springbootdemo.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "JobTask")
@Data
public class jobTask {
    private int id;
    private String groupid;
    private String name;
    private String classname;
    private String cron;
}
