package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Manager;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Integer>{
    //alt + enter
}
