package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@Data
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer items_id;
    private Integer items_menu_id;
    private Integer items_amount;
    private String items_message;
    private Float items_sumcost;
    private Date items_date;

}
