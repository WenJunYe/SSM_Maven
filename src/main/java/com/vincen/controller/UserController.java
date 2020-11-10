package com.vincen.controller;


import com.vincen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String finaAll(){
        System.out.println("表现层 查询所有账户信息");

        /*调用service方法*/
        userService.findAll();
        return "list";
    }
}
