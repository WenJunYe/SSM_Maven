package com.vincen.dao;

import com.vincen.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    账户接口
*/
@Repository
public interface UserDao {
    //查询所有用户
    @Select("select * from user")
    public List<User> findAll();
    @Insert("insert into user (name,password) values (#{name},#{password})")
    public void SaveUser(User user);
}
