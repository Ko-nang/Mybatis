package com.magi.test;

import com.magi.User;
import com.magi.dao.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Ko-nang
 * @date 2019/5/31 08:50
 */
public class MybatisTest {
   @Test
    public void T1() throws IOException {
       //1.读取配置文件；
       InputStream in = Resources.getResourceAsStream("SqlMap-Config.xml");
       //2.创建SqlSessionFactory工厂
       SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
       SqlSessionFactory factory = builder.build(in);
       //3.使用工厂生产SqlSession对象
       SqlSession session = factory.openSession();
       //4.使用SqlSession创建Dao接口的代理对象
       IUserDao userDao = session.getMapper(IUserDao.class);
       //5.使用代理对象执行方法
       List<User> users = userDao.findAll();
       System.out.println(users);
       //6.释放资源
       session.close();
       in.close();
   }
}
