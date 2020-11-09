package com.vincen.service;

import com.vincen.domain.User;


import java.util.List;


public interface UserService {
    public List<User> findAll();
    public void SaveUser(User user);
}
