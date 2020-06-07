package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Buy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer buy_id;
    private Integer buy_toy_id;
    private Integer buy_user_id;
    private Integer buy_amount;
    private Float buy_sumcost;
    private String buy_message;


}
