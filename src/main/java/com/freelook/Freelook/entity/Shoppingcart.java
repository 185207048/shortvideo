package com.freelook.Freelook.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Shoppingcart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shoppingcart_id;
    private Integer shoppingcart_user_id;
    private Integer shoppingcart_toy_id;
    private String shoppingcart_toy_name;
    private Float shoppingcart_toy_cost;
    private Integer shoppingcart_amount;
    private Float shoppingcart_sumcost;
}
