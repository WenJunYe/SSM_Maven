package com.vincen.test;

import com.vincen.dao.UserDao;
import com.vincen.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


/**
 * @Author wenjun
 * @Date 2020/11/10 14:09
 * @Version 1.0
 */
public class TestMyBatis {
    @Test
    public void run1() throws IOException {
//        //加载配置文件
//       InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
//       //创建SqlSessionFactory对象
//        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
//       //创建SqlSession对象
//        SqlSession session=factory.openSession();
//        //获取代理对象
//       UserDao dao= session.getMapper(UserDao.class);
//            //查询所有数据
//            List<User> list=dao.findAll();
//            for(User user:list)
//                System.out.println(user);
//        //关闭资源
//        session.close();
//        in.close();
    }
    @Test
    public void run2() throws IOException {
//        User user1 = new User();
//        user1.setName("德华");
//        user1.setPassword("1234");
//        user1.setRole("1");
//
//        //加载配置文件
//        InputStream in= Resources.getResourceAsStream("mybatis-config.xml");
//        //创建SqlSessionFactory对象
//        SqlSessionFactory factory= new SqlSessionFactoryBuilder().build(in);
//        //创建SqlSession对象
//        SqlSession session=factory.openSession();
//        //获取代理对象
//        UserDao dao= session.getMapper(UserDao.class);
//
//        //保存
//        dao.SaveUser(user1);
//        //提交资源
//        session.commit();
//        //关闭资源
//        session.close();
//        in.close();
    }
}
