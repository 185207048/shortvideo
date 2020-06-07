package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Items;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Items, Integer>{
    //alt + enter
}
