package com.vincen.controller;


import com.vincen.domain.User;
import com.vincen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public String finaAll(Model model){
        System.out.println("表现层 查询所有账户信息");
        /*调用service方法*/
        List<User> list = userService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        userService.SaveUser(user);
        response.sendRedirect(request.getContextPath()+"/user/findAll");
        return;
    }
}
