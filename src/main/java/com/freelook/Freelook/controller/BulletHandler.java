package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.Bullet;
import com.freelook.Freelook.repository.BulletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bullet")
public class BulletHandler {
    @Autowired
    private BulletRepository bulletRepository;
    private Bullet bullet;
    @PostMapping(value = "/bulletAdd")
    public boolean Addbullet(Bullet bullet){ //添加
        Bullet result = bulletRepository.save(bullet);
        if(result == bulletRepository.save(bullet)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/bulletDelete")
    public boolean deletebullet(int bullet_id){ //删除
        bulletRepository.deleteById(bullet_id);
        return true;
    }

    @PostMapping(value = "/bulletUpdate")
    public boolean Updatebullet(Bullet bullet){ //修改
        Bullet result = bulletRepository.saveAndFlush(bullet);
        if(result == bulletRepository.saveAndFlush(bullet)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/bulletCheckAll")
    public List<Bullet> CheckAllbullet(){
        List<Bullet> bulletList = bulletRepository.findAll();
        return bulletList;
    }

    @PostMapping(value = "/bulletCheckById")
    public Bullet CkeckByIdbullet(int bullet_id){
        Bullet bullet = bulletRepository.findById(bullet_id).orElse(new Bullet());
        return  bullet;
    }
}
