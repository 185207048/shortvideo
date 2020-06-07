package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Menu;
import com.freelook.Freelook.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuRepository menuRepository;
    private Menu menu;
    @PostMapping(value = "/menuAdd")
    public boolean Addmenu(Menu menu){ //添加
        Menu result = menuRepository.save(menu);
        if(result == menuRepository.save(menu)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/menuDelete")
    public boolean deletemenu(int menu_id){ //删除
        menuRepository.deleteById(menu_id);
        return true;
    }

    @PostMapping(value = "/menuUpdate")
    public boolean Updatemenu(Menu menu){ //修改
        Menu result = menuRepository.saveAndFlush(menu);
        if(result == menuRepository.saveAndFlush(menu)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/menuCheckAll")
    public List<Menu> CheckAllmenu(){
        List<Menu> viodeList = menuRepository.findAll();
        return viodeList;
    }

    @PostMapping(value = "/menuCheckById")
    public Menu CkeckByIdmenu(int menu_id){
        Menu menu = menuRepository.findById(menu_id).orElse(new Menu());
        return  menu;
    }
}
