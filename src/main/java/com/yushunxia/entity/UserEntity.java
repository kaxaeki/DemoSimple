package com.yushunxia.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Data
@TableName("sys_dept")
public class UserEntity implements Serializable {
    private BigInteger id;
    private String name;
    private Date createDate;
    /**
     * 用户名
     */
    private String username;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 密码
     */
    @JsonIgnore
    private String password;
}
