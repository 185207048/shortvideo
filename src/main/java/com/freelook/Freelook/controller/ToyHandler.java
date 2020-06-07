package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Toy;
import com.freelook.Freelook.repository.ToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/toy")
public class ToyHandler {
    @Autowired
    private ToyRepository toyRepository;
    private Toy toy;
    @PostMapping(value = "/toyAdd")
    public boolean Addtoy(Toy toy){ //添加
        Toy result = toyRepository.save(toy);
        if(result == toyRepository.save(toy)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/toyDelete")
    public boolean deletetoy(int toy_id){ //删除
        toyRepository.deleteById(toy_id);
        return true;
    }

    @PostMapping(value = "/toyUpdate")
    public boolean Updatetoy(Toy toy){ //修改
        Toy result = toyRepository.saveAndFlush(toy);
        if(result == toyRepository.saveAndFlush(toy)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/toyCheckAll")
    public List<Toy> CheckAlltoy(){
        List<Toy> toyList = toyRepository.findAll();
        return toyList;
    }

    @PostMapping(value = "/toyCheckById")
    public Toy CkeckByIdtoy(int toy_id){
        Toy toy = toyRepository.findById(toy_id).orElse(new Toy());
        return  toy;
    }
}
