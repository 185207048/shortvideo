package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Items;
import com.freelook.Freelook.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemsHandler {
    @Autowired
    private ItemRepository itemRepository;
    private Items item;
    @PostMapping(value = "/itemAdd")
    public boolean Additem(Items item){ //添加
        Items result = itemRepository.save(item);
        if(result == itemRepository.save(item)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/itemDelete")
    public boolean deleteitem(int item_id){ //删除
        itemRepository.deleteById(item_id);
        return true;
    }

    @PostMapping(value = "/itemUpdate")
    public boolean Updateitem(Items item){ //修改
        Items result = itemRepository.saveAndFlush(item);
        if(result == itemRepository.saveAndFlush(item)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/itemCheckAll")
    public List<Items> CheckAllitem(){
        List<Items> itemsList = itemRepository.findAll();
        return itemsList;
    }

    @PostMapping(value = "/itemCheckById")
    public Items CkeckByIditem(int item_id){
        Items item = itemRepository.findById(item_id).orElse(new Items());
        return  item;
    }
}
