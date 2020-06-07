package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Call;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallRepository extends JpaRepository<Call, Integer>{
    //alt + enter
}
