package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer toy_id;
    private String toy_name;
    private String toy_key;
    private Integer toy_cost;
    private String toy_brief;
    private String toy_image;
    private Date toy_date;
    private String toy_manager;
    private String toy_state;
    private Integer toy_video_id;
}
