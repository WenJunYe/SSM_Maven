package com.vincen.test;

import com.vincen.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public  void run1(){
        //加载配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        UserService us= (UserService) ac.getBean("userService");
        //调用方法
        us.findAll();

        System.out.println("更新1——test");
        System.out.println("更新2——test");
        System.out.println("更新3——test");
        System.out.println("创建分支");
        System.out.println("主干添加");
        System.out.println("分支添加");

    }
}
