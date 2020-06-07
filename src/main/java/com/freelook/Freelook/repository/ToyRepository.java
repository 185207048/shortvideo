package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Toy;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToyRepository extends JpaRepository<Toy, Integer>{
    //alt + enter
}
