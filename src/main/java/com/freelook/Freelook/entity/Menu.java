package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.sql.Date;

@Entity
@Data
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer menu_id;
    private Integer menu_user_id;
    private Integer menu_toy_id;
    private Integer menu_number;
    private String menu_address;
    private Date menu_date;
    private Float menu_sumcost;
}
