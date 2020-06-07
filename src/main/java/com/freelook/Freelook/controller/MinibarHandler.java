package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Minibar;
import com.freelook.Freelook.repository.MinibarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/minibar")
public class MinibarHandler {
    @Autowired
    private MinibarRepository minibarRepository;
    private Minibar minibar;
    @PostMapping(value = "/minibarAdd")
    public boolean Addminibar(Minibar minibar){ //添加
        Minibar result = minibarRepository.save(minibar);
        if(result == minibarRepository.save(minibar)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/minibarDelete")
    public boolean deleteminibar(int minibar_id){ //删除
        minibarRepository.deleteById(minibar_id);
        return true;
    }

    @PostMapping(value = "/minibarUpdate")
    public boolean Updateminibar(Minibar minibar){ //修改
        Minibar result = minibarRepository.saveAndFlush(minibar);
        if(result == minibarRepository.saveAndFlush(minibar)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/minibarCheckAll")
    public List<Minibar> CheckAllminibar(){
        List<Minibar> viodeList = minibarRepository.findAll();
        return viodeList;
    }

    @PostMapping(value = "/minibarCheckById")
    public Minibar CkeckByIdminibar(int minibar_id){
        Minibar minibar = minibarRepository.findById(minibar_id).orElse(new Minibar());
        return  minibar;
    }
}
