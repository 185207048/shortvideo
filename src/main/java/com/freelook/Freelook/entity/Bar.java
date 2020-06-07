package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Bar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bar_id;
    private String bar_name;
    private Date bar_date;
    private String bar_key;
    private Integer bar_user_id;

}
