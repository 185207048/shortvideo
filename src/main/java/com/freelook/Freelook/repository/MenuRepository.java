package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Menu;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Integer>{
    //alt + enter
}
