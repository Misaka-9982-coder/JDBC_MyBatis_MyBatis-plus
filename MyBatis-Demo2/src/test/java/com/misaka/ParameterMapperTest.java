package com.misaka;

import com.misaka.mapper.ParameterMapper;
import com.misaka.pojo.User;
import com.misaka.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class ParameterMapperTest {

    @Test
    public void testSelectAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> allUser = mapper.getAllUser();
        for(User user : allUser) {
            System.out.println(user);
        }
    }
}
