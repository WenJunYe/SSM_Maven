package com.vincen.service.impl;

import com.vincen.domain.User;
import com.vincen.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        System.out.println("业务层 查询所有用户");
        return null;
    }

    @Override
    public void SaveUser(User user) {
        System.out.println("业务层 保存用户");
    }
}
