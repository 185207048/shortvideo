package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Label;
import com.freelook.Freelook.repository.LabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/label")
public class LabelHandler {
    @Autowired
    private LabelRepository labelRepository;
    private Label label;
    @PostMapping(value = "/labelAdd")
    public boolean Addlabel(Label label){ //添加
        Label result = labelRepository.save(label);
        if(result == labelRepository.save(label)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/labelDelete")
    public boolean deletelabel(int label_id){ //删除
        labelRepository.deleteById(label_id);
        return true;
    }

    @PostMapping(value = "/labelUpdate")
    public boolean Updatelabel(Label label){ //修改
        Label result = labelRepository.saveAndFlush(label);
        if(result == labelRepository.saveAndFlush(label)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/labelCheckAll")
    public List<Label> CheckAlllabel(){
        List<Label> labelList = labelRepository.findAll();
        return labelList;
    }

    @PostMapping(value = "/labelCheckById")
    public Label CkeckByIdlabel(int label_id){
        Label label = labelRepository.findById(label_id).orElse(new Label());
        return  label;
    }
}
