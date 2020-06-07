package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Label;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LabelRepository extends JpaRepository<Label, Integer>{
    //alt + enter
}
