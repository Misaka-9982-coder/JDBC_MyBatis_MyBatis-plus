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

    @Test
    public void testInsert() {
        User user = new User();
        user.setId(1L);
        user.setName("test");
        user.setAge(18);
        user.setEmail("23@156.com");
        int res = userMapper.insert(user);
        System.out.println("res = " + res);
        System.out.println("user.getId() = " + user.getId());
    }
}
