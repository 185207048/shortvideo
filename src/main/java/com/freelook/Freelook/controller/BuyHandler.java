package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Buy;
import com.freelook.Freelook.repository.BuyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buy")
public class BuyHandler {
    @Autowired
    private BuyRepository buyRepository;
    private Buy buy;
    @PostMapping(value = "/buyAdd")
    public boolean Addbuy(Buy buy){ //添加
        Buy result = buyRepository.save(buy);
        if(result == buyRepository.save(buy)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/buyDelete")
    public boolean deletebuy(int buy_id){ //删除
        buyRepository.deleteById(buy_id);
        return true;
    }

    @PostMapping(value = "/buyUpdate")
    public boolean Updatebuy(Buy buy){ //修改
        Buy result = buyRepository.saveAndFlush(buy);
        if(result == buyRepository.saveAndFlush(buy)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/buyCheckAll")
    public List<Buy> CheckAllbuy(){
        List<Buy> viodeList = buyRepository.findAll();
        return viodeList;
    }

    @PostMapping(value = "/buyCheckById")
    public Buy CkeckByIdbuy(int buy_id){
        Buy buy = buyRepository.findById(buy_id).orElse(new Buy());
        return  buy;
    }
}
