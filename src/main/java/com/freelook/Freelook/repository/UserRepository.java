package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.User;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    //alt + enter
}
