package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Call;
import com.freelook.Freelook.repository.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/call")
public class CallHandler {
    @Autowired
    private CallRepository callRepository;
    private Call call;
    @PostMapping(value = "/callAdd")
    public boolean Addcall(Call call){ //添加
        Call result = callRepository.save(call);
        if(result == callRepository.save(call)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/callDelete")
    public boolean deletecall(int call_id){ //删除
        callRepository.deleteById(call_id);
        return true;
    }

    @PostMapping(value = "/callUpdate")
    public boolean Updatecall(Call call){ //修改
        Call result = callRepository.saveAndFlush(call);
        if(result == callRepository.saveAndFlush(call)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/callCheckAll")
    public List<Call> CheckAllcall(){
        List<Call> callList = callRepository.findAll();
        return callList;
    }

    @PostMapping(value = "/callCheckById")
    public Call CkeckByIdcall(int call_id){
        Call call = callRepository.findById(call_id).orElse(new Call());
        return  call;
    }
}
