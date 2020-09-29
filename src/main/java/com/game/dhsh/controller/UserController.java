package com.game.dhsh.controller;


import com.game.dhsh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author liuxiangchao
 */
@Controller
@RequestMapping("/api/user")
public class UserController {
    private UserMapper userMapper;
    @Autowired
    public UserController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @RequestMapping("/index")
    public String showIndex(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String account,String password){
        Integer result=userMapper.login(account,password);
        if(0!=result){
            return "index";
        }
        else{
            return "loginError";
        }
    }
    @PostMapping("toRegisterPage")
    public String toRegisterPage(){
        return "register";
    }
    @PostMapping("register")
    public String register(String account,String password){
        return "index";
    }

}
