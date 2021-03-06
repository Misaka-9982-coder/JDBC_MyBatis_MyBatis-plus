package com.misaka;

import com.misaka.mapper.SelectMapper;
import com.misaka.pojo.User;
import com.misaka.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SelectMapperTest {

    @Test
    public void testGetUserById() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        User user = mapper.getUserById(3);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testGetAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        List<User> users = mapper.getAllUser();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testGetCount() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Integer count = mapper.getCount();
        System.out.println(count);
        sqlSession.close();
    }

    @Test
    public void testGetUserByIdMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        Map<String, Object> userByIdMap = mapper.getUserByIdMap(3);
        System.out.println(userByIdMap);
    }

    @Test
    public void testGetAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        var userByIdMap = mapper.getAllUserToMap();
        System.out.println(userByIdMap);
    }
}
