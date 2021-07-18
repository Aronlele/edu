package com.bamboocloud.qustedudemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * .
 *
 * @author 薛乐乐
 * @date 2021/7/18 18:07
 * @since
 */
@TableName("user")
public class UserEntity {

    @TableId
    private Integer id;

    @TableField
    private String name;

    @TableField
    private String sex;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
