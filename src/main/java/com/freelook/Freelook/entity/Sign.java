package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Sign {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer video_id;       //视频id
    private Integer label_id;       //标签id
    private String sign_video_name; //标记的视频名
    private String sign_video_class;//标记的视频种类
    private String sign_label_name; //标记的标签名
    private String sign_label_type; //标记的标签种类

}
