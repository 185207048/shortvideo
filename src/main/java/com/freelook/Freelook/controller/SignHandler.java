package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Sign;
import com.freelook.Freelook.repository.SignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sign")
public class SignHandler {
    @Autowired
    private SignRepository signRepository;
    private Sign sign;
    @PostMapping(value = "/signAdd")
    public boolean Addsign(Sign sign){ //添加
        Sign result = signRepository.save(sign);
        if(result == signRepository.save(sign)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/signDelete")
    public boolean deletesign(int sign_id){ //删除
        signRepository.deleteById(sign_id);
        return true;
    }

    @PostMapping(value = "/signUpdate")
    public boolean Updatesign(Sign sign){ //修改
        Sign result = signRepository.saveAndFlush(sign);
        if(result == signRepository.saveAndFlush(sign)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/signCheckAll")
    public List<Sign> CheckAllsign(){
        List<Sign> signList = signRepository.findAll();
        return signList;
    }

    @PostMapping(value = "/signCheckById")
    public Sign CkeckByIdsign(int sign_id){
        Sign sign = signRepository.findById(sign_id).orElse(new Sign());
        return  sign;
    }
}
