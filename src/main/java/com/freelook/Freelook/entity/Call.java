package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Call {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer call_id;
    private Integer call_video_id;
    private Integer call_user_id;
    private String call_content;
    private Date call_date;
}
