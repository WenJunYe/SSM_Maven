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
    @Select("select * from users")
    public List<User> findAll();
    @Insert("insert into users (user_name,user_password,user_role_id) values (#{user_name},#{user_password},1)")
    public void SaveUser(User user);
}
