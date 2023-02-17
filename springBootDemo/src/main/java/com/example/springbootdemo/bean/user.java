package com.example.springbootdemo.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
/**
 * fluent:不写默认为false，当该值为 true 时，对应字段的 getter 方法前面就没有 get，setter 方法就不会有 set。
 * chain:不写默认为false，当该值为 true 时，对应字段的 setter 方法调用后，会返回当前对象。
 * prefix:该属性是一个字符串数组，当该数组有值时，表示忽略字段中对应的前缀，生成对应的 getter 和 setter 方法。
 */
@ApiModel
public class user {
    private Long id;
    private String username;
    private String password;
    private String email;


}
