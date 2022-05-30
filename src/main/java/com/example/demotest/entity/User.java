package com.example.demotest.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.util.Date;

/**
 * @author Tomoyo
 * @version V1.0
 * @Package com.example.demomptest.entity
 * @date 2022/5/28 15:44
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;
    //表示添加时赋值
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;

    public static void main(String[] args) {
        System.out.println("hello hot-fix");
        System.out.println("hello hot-fix2");

    }
}
