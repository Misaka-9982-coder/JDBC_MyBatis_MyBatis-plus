package com.misaka;

import com.misaka.mapper.SQLMapper;
import com.misaka.pojo.User;
import com.misaka.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> usersByLike = mapper.getUserByLike("张三");
        for (User user : usersByLike) {
            System.out.println(user);
        }
    }

    @Test
    public void testDeleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int res = mapper.deleteMore("1, 2, 3");
        System.out.println(res);
    }

    @Test
    public void testGetUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> t_user = mapper.getUserByTableName("t_user");
        for(User user : t_user) {
            System.out.println(user);
        }
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null, "王武", "1223", 23, "女", "123@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}

