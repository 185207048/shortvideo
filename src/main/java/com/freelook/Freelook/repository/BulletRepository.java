package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Bullet;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BulletRepository extends JpaRepository<Bullet, Integer>{
    //alt + enter
}
