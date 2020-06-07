package com.freelook.Freelook.repository;

import com.freelook.Freelook.entity.Address;
import com.freelook.Freelook.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer>{
    //alt + enter
}
