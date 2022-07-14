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
}

