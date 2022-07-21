package com.misaka.mybatisplus;

import com.misaka.mybatisplus.mapper.UserMapper;
import com.misaka.mybatisplus.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void testSelectList() {

        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}
