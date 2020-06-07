package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.User;
import com.freelook.Freelook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;
    private User user;
    @PostMapping(value = "/register")
    public boolean Adduser(User user){ //添加
        User result = userRepository.save(user);
        if(result == userRepository.save(user)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value="/userDelete")
    public boolean deleteuser(int user_id){ //删除
        userRepository.deleteById(user_id);
        return true;
    }

    @PostMapping(value = "/userUpdate")
    public boolean Updateuser(User user){ //修改
        User result = userRepository.saveAndFlush(user);
        if(result == userRepository.saveAndFlush(user)){
            return true;
        }else{
            return false;
        }
    }

    @PostMapping(value = "/userCheckAll")
    public List<User> CheckAlluser(){
        List<User> userList = userRepository.findAll();
        return userList;
    }

    @PostMapping(value = "/userCheckById")
    public User CkeckByIduser(int user_id){
        User user = userRepository.findById(user_id).orElse(new User());
        return  user;
    }

    @PostMapping(value = "/login")
    public int Login(@RequestParam String username, @RequestParam String password){
        User user = userRepository.findByUserNameAndPwd(username,password);
        if(user != null){
            int id = user.getUser_id();
            return id;
        }else{
            return -1;
        }
    }
}
