package com.vincen.service.impl;

import com.vincen.dao.UserDao;
import com.vincen.domain.User;
import com.vincen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void SaveUser(User user) {
        userDao.SaveUser(user);
    }
}
