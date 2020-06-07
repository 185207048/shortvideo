package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Minibar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer minibar_id;
    private Integer minibar_user_id; //回帖用户
    private Date minibar_date;       //回帖时间
    private String minibar_content;  //回帖内容
    private Integer minibar_bar_id;  //回的那个贴
}
