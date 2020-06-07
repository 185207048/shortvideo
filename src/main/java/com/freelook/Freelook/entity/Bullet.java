package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Bullet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bullet_id;
    private Integer bullet_pushtime;
    private String bullet_content;
    private String bullet_color;
    private Integer bullet_fontsize;
    private Integer bullet_video_id;

}
