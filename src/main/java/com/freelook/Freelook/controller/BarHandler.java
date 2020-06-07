package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Bar;
import com.freelook.Freelook.repository.BarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bar")
public class BarHandler {
    @Autowired
    private BarRepository barRepository;
    private Bar bar;
    @PostMapping(value = "/barAdd")
    public boolean Addbar(Bar bar){ //添加
        Bar result = barRepository.save(bar);
        if(result == barRepository.save(bar)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/barDelete")
    public boolean deletebar(int bar_id){ //删除
        barRepository.deleteById(bar_id);
        return true;
    }

    @PostMapping(value = "/barUpdate")
    public boolean Updatebar(Bar bar){ //修改
        Bar result = barRepository.saveAndFlush(bar);
        if(result == barRepository.saveAndFlush(bar)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/barCheckAll")
    public List<Bar> CheckAllbar(){
        List<Bar> barList = barRepository.findAll();
        return barList;
    }

    @PostMapping(value = "/barCheckById")
    public Bar CkeckByIdbar(int bar_id){
        Bar bar = barRepository.findById(bar_id).orElse(new Bar());
        return  bar;
    }
}
