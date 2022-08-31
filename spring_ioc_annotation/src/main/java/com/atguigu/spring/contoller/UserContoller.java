package com.atguigu.spring.contoller;

import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("controller")
public class UserContoller {

    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }

}
