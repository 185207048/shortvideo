package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Address;
import com.freelook.Freelook.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressHandler {
    @Autowired
    private AddressRepository addressRepository;
    private Address address;
    @PostMapping(value = "/addressAdd")
    public boolean Addaddress(Address address){ //添加
        Address result = addressRepository.save(address);
        if(result == addressRepository.save(address)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/addressDelete")
    public boolean deleteaddress(int address_id){ //删除
        addressRepository.deleteById(address_id);
        return true;
    }

    @PostMapping(value = "/addressUpdate")
    public boolean Updateaddress(Address address){ //修改
        Address result = addressRepository.saveAndFlush(address);
        if(result == addressRepository.saveAndFlush(address)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/addressCheckAll")
    public List<Address> CheckAlladdress(){
        List<Address> addressList = addressRepository.findAll();
        return addressList;
    }

    @PostMapping(value = "/addressCheckById")
    public Address CkeckByIdaddress(int address_id){
        Address address = addressRepository.findById(address_id).orElse(new Address());
        return  address;
    }
}
