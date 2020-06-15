package com.freelook.Freelook.controller;

import com.freelook.Freelook.entity.User;
import com.freelook.Freelook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.tools.jconsole.JConsole;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserRepository userRepository;
    private User user;
    @CrossOrigin
    @PostMapping(value="/register")
    public boolean Adduser(User user){ //添加
        System.out.println(user);
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
        System.out.println(userList);
        return userList;
    }

    @PostMapping(value = "/userCheckById")
    public User CkeckByIduser(int user_id){
        User user = userRepository.findById(user_id).orElse(new User());
        return  user;
    }

    @PostMapping(value = "/login")
    public User Login(User user){
        System.out.println(user);
       List<User> list = userRepository.findAll();
       for(int i=0 ; i < list.size() ; i++){
//           if(list[i].)
           User re_user = list.get(i);
//           System.out.println(re_user);
//           System.out.println(re_user.getUser_username().equals( user.getUser_username()));
//           System.out.println(user.getUser_username() );
//           System.out.println(re_user.getUser_password());
//           System.out.println(user.getUser_password());
           if(re_user.getUser_username() .equals(user.getUser_username())  && re_user.getUser_password().equals(user.getUser_password())){
               return user;
           }
       }
       return null;
    }
}
