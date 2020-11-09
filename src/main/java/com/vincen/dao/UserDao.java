package com.vincen.dao;

import com.vincen.domain.User;

import java.util.List;

/*
    账户接口
*/
public interface UserDao {
    public List<User> findAll();
    public void SaveUser(User user);
}
