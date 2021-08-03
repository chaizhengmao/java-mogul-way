package com.cimu.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/28 16:57
 * @since: 1.0.0
 */
@Data
@TableName("user")
public class User {
    @TableId
    private Integer id;
    @TableField("name")
    private String name;
    @TableField("age")
    private Integer age;
}
