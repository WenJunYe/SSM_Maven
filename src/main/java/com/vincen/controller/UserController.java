package com.vincen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/findAll")
    public String finaAll(){
        System.out.println("表现层 查询所有账户信息");
        return "list";
    }
}
