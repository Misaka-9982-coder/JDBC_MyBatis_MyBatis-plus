package com.misaka.test;

import com.misaka.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

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
}
