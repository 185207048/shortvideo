package com.freelook.Freelook.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id; //用户id
    private String user_username; //用户的用户类
    private String user_password; //用户密码
    private String user_header;   //用户头像
    private String user_name; //用户名称
    private String user_signature; //用户签名
    private String user_sex; //用户性别
//    private Date user_birth;    //用户生日
}
