package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Manager;
import com.freelook.Freelook.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerHandler {
    @Autowired
    private ManagerRepository managerRepository;
    private Manager manager;
    @PostMapping(value = "/managerAdd")
    public boolean Addmanager(Manager manager){ //添加
        Manager result = managerRepository.save(manager);
        if(result == managerRepository.save(manager)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/managerDelete")
    public boolean deletemanager(int manager_id){ //删除
        managerRepository.deleteById(manager_id);
        return true;
    }

    @PostMapping(value = "/managerUpdate")
    public boolean Updatemanager(Manager manager){ //修改
        Manager result = managerRepository.saveAndFlush(manager);
        if(result == managerRepository.saveAndFlush(manager)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/managerCheckAll")
    public List<Manager> CheckAllmanager(){
        List<Manager> managerList = managerRepository.findAll();
        return managerList;
    }

    @PostMapping(value = "/managerCheckById")
    public Manager CkeckByIdmanager(int manager_id){
        Manager manager = managerRepository.findById(manager_id).orElse(new Manager());
        return  manager;
    }
}
