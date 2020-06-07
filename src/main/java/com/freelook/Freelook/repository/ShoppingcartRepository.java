package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Address;
import com.freelook.Freelook.entity.Shoppingcart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingcartRepository extends JpaRepository<Shoppingcart, Integer>{
    //alt + enter
}
