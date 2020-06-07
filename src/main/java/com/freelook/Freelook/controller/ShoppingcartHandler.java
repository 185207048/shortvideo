package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Shoppingcart;
import com.freelook.Freelook.repository.ShoppingcartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shoppingcart")
public class ShoppingcartHandler {
    @Autowired
    private ShoppingcartRepository shoppingcartRepository;
    private Shoppingcart shoppingcart;
    @PostMapping(value = "/shoppingcartAdd")
    public boolean Addshoppingcart(Shoppingcart shoppingcart){ //添加
        Shoppingcart result = shoppingcartRepository.save(shoppingcart);
        if(result == shoppingcartRepository.save(shoppingcart)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/shoppingcartDelete")
    public boolean deleteshoppingcart(int shoppingcart_id){ //删除
        shoppingcartRepository.deleteById(shoppingcart_id);
        return true;
    }

    @PostMapping(value = "/shoppingcartUpdate")
    public boolean Updateshoppingcart(Shoppingcart shoppingcart){ //修改
        Shoppingcart result = shoppingcartRepository.saveAndFlush(shoppingcart);
        if(result == shoppingcartRepository.saveAndFlush(shoppingcart)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/shoppingcartCheckAll")
    public List<Shoppingcart> CheckAllshoppingcart(){
        List<Shoppingcart> shoppingcartList = shoppingcartRepository.findAll();
        return shoppingcartList;
    }

    @PostMapping(value = "/shoppingcartCheckById")
    public Shoppingcart CkeckByIdshoppingcart(int shoppingcart_id){
        Shoppingcart shoppingcart = shoppingcartRepository.findById(shoppingcart_id).orElse(new Shoppingcart());
        return  shoppingcart;
    }
}
