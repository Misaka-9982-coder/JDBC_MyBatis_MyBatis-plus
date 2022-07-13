package com.misaka.test;

import com.misaka.mapper.UserMapper;
import com.misaka.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void testMybatis() throws Exception {
        // 1.读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 3.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = builder.build(resourceAsStream);
        // 4.创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.创建UserMapper接口的实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.执行SQL语句
        int result = mapper.insertUser();
        // 7.提交事务
//        sqlSession.commit();

        System.out.println("result = " + result);

    }

    @Test
    public void updateUser() throws Exception {
        // 1.读取配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 2.创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        // 3.创建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = builder.build(resourceAsStream);
        // 4.创建SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 5.创建UserMapper接口的实现类对象
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 6.执行SQL语句
        mapper.updateUser();
    }

    @Test
    public void testCRUD() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //mapper.updateUser();
        //mapper.deleteUser();
        /*User user = mapper.getUserById();
        System.out.println(user);*/
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }
}
