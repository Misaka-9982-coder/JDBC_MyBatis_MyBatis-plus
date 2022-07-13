package com.misaka.mapper;

import com.misaka.pojo.User;

import java.util.List;

public interface UserMapper {
    // 添加用户信息
    int insertUser();

    // 更新
    void updateUser();

    void deleteUser();


    // 根据id查询用户信息
    User getUserById();


    // 查询所有的用户信息
    List<User> getAllUser();
}
